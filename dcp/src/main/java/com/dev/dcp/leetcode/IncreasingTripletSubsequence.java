package com.dev.dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */
public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        int count=0;
        /*for(int i=0;i<nums.length-2;i++) {
            if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2]) {
                count++;
                return true;
            }
        }
        //return count;
        return false;*/

        int small=0;
        System.out.println(nums.length);
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]<nums[j]) {
                    for(int k=j+1;k<nums.length;k++) {
                        if(nums[j]<nums[k]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
