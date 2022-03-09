package com.dev.dcp.array;

/**
 * Created by My PC on 2/27/2021.
 */
public class rakuten {

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.
        System.out.println("This is a debug message");
        int[] arrA = {3,4,5,1,2};
        boolean isSorted = isArraySorted(arrA);
        System.out.println("isSorted:"+isSorted);
    }

    public static boolean isArraySorted(int[] args) {
        //int counter = 1;
        int sortedStartIndex = 0;
        if(args[0]<args[args.length-1]) {
            for(int i=0;i<args.length-1;i++) {
                if(args[i] <= args[i+1]) {
                    continue;
                } else {
                    return false;
                }
            }
        } else {
            for(int i=0;i<args.length-1;i++) {
                if(args[i] <= args[i+1]) {
                    continue;
                } else {
                    sortedStartIndex = i+1;
                    break;
                }
            }
            for(int i=sortedStartIndex;i<args.length-1;i++) {
                if(args[i] <= args[i+1]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
