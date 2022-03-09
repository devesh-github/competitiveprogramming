package com.dev.dcp.leetcode;

import java.util.*;
import java.lang.*;

/**
 * Created by My PC on 2/1/2021.
 */
public class SquaresofaSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] new1 = new int[nums.length];
        int i=0;
        for(int n:nums) {
            new1[i++] = Math.abs(n);
        }
        Arrays.sort(new1);
        //new1.forEach(a -> a*a);
        int j=0;
        for(int n:new1) {
            new1[j] = n*n;
            System.out.println(n);
            j++;
        }
        return new1;
    }

}
