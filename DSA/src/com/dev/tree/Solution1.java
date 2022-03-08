package com.dev.tree;

import java.util.Arrays;

public class Solution1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1,0 };
		System.out.println(new Solution1().solution(arr));
	}

	public int solution(int[] A) {
        // write your code in Java SE 8
        
		int[] A1 = Arrays.copyOf(A, A.length);
        //int[] A1 = A;
        int count1=0;
        if(A1[0]!=1) {
            A1[0]=1;
            count1++;
        }
        count1=countItr(A1,count1);
        /*int first = A[0];
        for(int i=0;i<A.length;i++) {
            if(i!=0) {
                if(i%2!=0 && A[i]==first) {
                    count1++;
                }
                
                if(i%2==0 && A[i]!=first) {
                    count1++;
                }
            }
        }*/
        
        //int[] A2 = A;
        int[] A2 = Arrays.copyOf(A, A.length);
        int count2=0;
        if(A2[0]!=0) {
            A2[0]=0;
            count2++;
        }
        count2=countItr(A2,count2);
        /*first = A[0];
        for(int i=0;i<A.length;i++) {
            if(i!=0) {
                if(i%2!=0 && A[i]==first) {
                    count2++;
                }
                
                if(i%2==0 && A[i]!=first) {
                    count2++;
                }
            }
        }*/
        
        return Math.min(count1,count2);
    }
    
    public int countItr(int[] A,int count) {
        int first = A[0];
        for(int i=0;i<A.length;i++) {
            if(i!=0) {
                if(i%2!=0 && A[i]==first) {
                    count++;
                }
                
                if(i%2==0 && A[i]!=first) {
                    count++;
                }
            }
        }
        return count;
    }

}
