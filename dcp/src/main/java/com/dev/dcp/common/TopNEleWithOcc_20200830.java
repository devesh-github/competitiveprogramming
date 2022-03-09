package com.dev.dcp.common;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TopNEleWithOcc_20200830 {

    // Time complexity details
    // TreeMap
    // https://www.tutorialspoint.com/Difference-between-TreeMap-HashMap-and-LinkedHashMap-in-Java#:~:text=TreeMap%20has%20complexity%20of%20O,in%20sorted%20and%20ascending%20order.
    // https://stackoverflow.com/questions/20487619/complexity-of-treemap-insertion-vs-hashmap-insertion
    // Collections.sort
    // https://stackoverflow.com/questions/25492648/what-is-the-time-complexity-of-collectionssort-method-in-java#:~:text=2%20Answers&text=This%20depends%20on%20the%20version,N*log(N)).&text=The%20sorting%20algorithm%20is%20a,element%20in%20the%20high%20sublist).

    // getTopN occurrence number in a given int array
    // for example:
    // int[] array = {12, 34, 11, 10, 78, 12, 34, 9, 12}
    // if N = 4 then:
    // top1: [12, 3]
    // top2: [34, 2]
    // top3: [78, 1]
    // top4: [11, 1]

    // time : O(n2)
    // space: O(n)

    // execute getTopN(array, 4) print output: 12, 3\r\n 34, 2\r\n 78, 1\r\n
    // ....etc

    public static void main(String[] args) {
        int[] array = { 12, 34, 11, 10, 78, 12, 34, 9, 12 };
        TopNEleWithOcc_20200830 topNElementsWithOccurances = new TopNEleWithOcc_20200830();
        topNElementsWithOccurances.getTopN(array, 4);

        //https://mkyong.com/java/java-how-to-convert-a-primitive-array-to-list/
        List list = Arrays.stream(array)		// IntStream
                .boxed()  		// Stream<Integer>
                .collect(Collectors.toList());
        List list2 = IntStream.of(array)	  // returns IntStream
                .boxed()
                .collect(Collectors.toList());
        //topNElementsWithOccurances.countFrequencies(list);
    }

    void getTopN(int[] array, int N) {
        Map<Integer, List<Integer>> inpMap = new TreeMap<>(
                Collections.reverseOrder());
        Map<Integer, Integer> inpCount = new HashMap<>();

        // o(n),o(n)
        for (int i = 0; i < array.length; i++) {
            if (inpCount.size() == 0 || inpCount.get(array[i]) == null) {
                inpCount.put(array[i], 1);
            } else {
                inpCount.put(array[i], inpCount.get(array[i]) + 1);
            }
        }

        // o(nlogn),o(n)
        List<Integer> newList;// = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : inpCount.entrySet()) {
            newList = inpMap.get(entry.getValue());
            if (newList == null) {
                newList = new ArrayList<>();
            }
            newList.add(entry.getKey());
            Collections.sort(newList, Collections.reverseOrder());
            inpMap.put(entry.getValue(), newList);
        }

        // 0(n), o(n)
        int count = 0;
        for (Map.Entry<Integer, List<Integer>> custMapEntry : inpMap.entrySet()) {
            for (Integer inp : custMapEntry.getValue()) {
                if (count < N) {
                    System.out.println("[" + inp + " " + custMapEntry.getKey()
                            + "]");
                    count++;
                }
            }
        }
    }

    // ///// Heap
    public List<Integer> topKFrequent(int[] nums, int k) {
        //count the frequency for each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // create a min heap
        PriorityQueue<Map.Entry<Integer, Integer>> queue
                = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));

        //maintain a heap of size k.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        //get all elements from the heap
        List<Integer> result = new ArrayList<>();
        while (queue.size() > 0) {
            result.add(queue.poll().getKey());
        }

        //reverse the order
        Collections.reverse(result);

        return result;
    }

    static void print_N_mostFrequentNumber(int[] arr, int n, int k)
    {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

        // Put count of all the distinct elements in Map 
        // with element as the key & count as the value. 
        for (int i = 0; i < n; i++) {

            // Get the count for the element if already present in the Map 
            // or get the default value which is 0. 
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Create a Priority Queue to sort based on the count 
        // or on the key if the count is same 
        PriorityQueue<Map.Entry<Integer, Integer> > queue =
                new PriorityQueue<>(
                        (a, b) -> a.getValue().equals(b.getValue()) ?
                                Integer.compare(b.getKey(), a.getKey()) :
                                Integer.compare(b.getValue(), a.getValue()));

        // Insert the data from the map to the Priority Queue. 
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
            queue.offer(entry);

        // Print the top k elements 
        for (int i = 0; i < k; i++) {
            System.out.println(queue.poll().getKey());
        }
    }

    public static void countFrequencies(List<Integer> list) {
        // hash set is created and elements of
        // arraylist are insertd into it
        Set<Integer> st = new HashSet<Integer>(list);
        for (Integer s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

}