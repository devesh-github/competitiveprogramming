package com.dev.dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */
public class FourSumII {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        /*int count=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                for(int k=0;k<C.length;k++){
                    for(int l=0;l<D.length;l++){
                        if(A[i]+B[j]+C[k]+D[l] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;*/
        return fourSumCountHelper(A,B,C,D);
    }

    public int fourSumCountHelper(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int a : A)
            for(int b : B){
                int s = a+b;
                map.put( s, map.getOrDefault(s, 0)+1 );
            }

        int result=0;
        for(int c : C)
            for(int d : D){
                int s = -c-d;
                result += map.getOrDefault(s, 0);
            }
        return result;
    }

}
