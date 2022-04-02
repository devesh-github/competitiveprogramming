package dcp.queue;

import java.util.PriorityQueue;

/**
 * Created by My PC on 10/27/2020.
 */
public class MergeNSortedArrays {

    public static void main(String[] args) {
        int[][] arr = {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};
        MergeNSortedArrays msArr = new MergeNSortedArrays();

        int[] out = msArr.merge(arr);
        for (int j = 0; j < out.length; j++) {
            System.out.print(out[j] + " ");
        }
    }

    private class QueueNode implements Comparable<QueueNode> {
        int array, index, value;

        public QueueNode(int array, int index, int value) {
            this.array = array;
            this.index = index;
            this.value = value;
        }

        public int compareTo(QueueNode n) {
            if (value > n.value) return 1;
            if (value < n.value) return -1;
            return 0;
        }
    }

    public int[] merge(int[][] arrays) {
        PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();

        int size = 0;
        for (int i = 0; i < arrays.length; i++) {
            size += arrays[i].length;
            if (arrays[i].length > 0) {
                pq.add(new QueueNode(i, 0, arrays[i][0]));
            }
        }

        //pq => {1, 9, 20, 1000}  {2, 6, 12, 34}  {23, 34, 90, 2000}

        int[] result = new int[size];
        for (int i = 0; !pq.isEmpty(); i++) {
            QueueNode n = pq.poll();
            result[i] = n.value;
            int newIndex = n.index + 1;
            if (newIndex < arrays[n.array].length) {
                pq.add(new QueueNode(n.array, newIndex,arrays[n.array][newIndex]));
            }
        }

        return result;
    }

}