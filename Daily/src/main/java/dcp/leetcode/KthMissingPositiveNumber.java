package dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */
public class KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {
        int len = arr.length,count=0,prev=0;
        if(arr[0]==1) {
            count = 0;
        } else {
            count = arr[0] - 1;
        }
        System.out.println(count);
        if(k==count) {
            return count;
        } else if(k<count) {
            return k;
        }
        for(int i=0;k>=count && i<len-1;i++) {
            prev = count;
            count = count + (arr[i+1] - arr[i] -1);
            System.out.println(count);
            if(count>=k) {
                System.out.println(count);
                return arr[i]+(k-prev);
            }
        }
        System.out.println(count);
        if(k>=count) {
            return arr[len-1]+(k-count);
        }
        return 1;
    }

}
