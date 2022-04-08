package dcp.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappyNumber(3));
    }

    public static boolean isHappyNumber(int n) {
        int rem=0,sum=0;
        //List ls = new ArrayList<Integer>();
        Set ls = new HashSet();
        for (int i=1; n>=1;i++) {
            rem = n%10;
            sum = sum + (int)Math.pow(rem,2);
            n = n/10;

            if(n<1 && sum==1) {
                return true;
            } else if(n<1) {
                if(ls.contains(sum)) {
                    return false;
                } else {
                    ls.add(sum);
                }
                n = sum;
                sum = 0;
            }
        }
        return false;
    }

}
