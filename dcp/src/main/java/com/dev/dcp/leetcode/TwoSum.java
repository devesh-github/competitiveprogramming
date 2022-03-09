package com.dev.dcp.leetcode;

class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        int counter =0,counter2=0;
        /*for(int i:nums) {
            for(int j: nums) {
                if(i+j==target) {
                    return (new int[]{counter,counter2});
                }
                counter2++;
            }
            counter++;
        }*/
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    return (new int[]{i,j});
                }
            }
        }
        return new int[2];
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        //int[] num = new int[]{2, 7, 11, 15};
        int[] num = new int[]{3,2,4};
        s.twoSum(num,6);
    }
}