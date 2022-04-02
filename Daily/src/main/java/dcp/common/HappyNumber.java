package dcp.common;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappyNumber(49));
    }

    public static boolean isHappyNumber(int n) {
        int rem=0,sum=0;
        List ls = new ArrayList<Integer>();
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
