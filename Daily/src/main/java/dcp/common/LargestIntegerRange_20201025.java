package dcp.common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by My PC on 10/25/2020.
 */
public class LargestIntegerRange_20201025 {

    public static void main(String[] args) {
        Integer[] inp = {9, 6, 1, 3, 8, 10, 12, 11};
        //List l = Arrays.asList(inp);
        List<Integer> l = Arrays
                .stream(inp)
                .collect(Collectors.toList());
        System.out.println(l);
        for (int i = 0; i < inp.length; i++) {
            int counter = i+1;
            while(counter<inp.length) {
                if (findMissingEle(inp[i], inp[counter], l)) {
                    System.out.println(inp[i] + " " + inp[counter]);
                    counter++;
                } else {
                    break;
                }
            }
        }
    }

    public static boolean findMissingEle(int a, int b, List l) {
        int diff = 0, min = 0, max = 0;
        if (a > b) {
            diff = a - b;
            min = b;
            max = a;
        } else {
            diff = b - a;
            min = a;
            max = b;
        }
        for (int i = diff; i > 0; i--) {
            if (l.contains(min + i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
