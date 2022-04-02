package dcp.common;

import java.math.BigInteger;

public class FactorialOfaNumber {

    public static void main(String[] args) {
        System.out.println(FactorialOfaNumber.factorial(25000));
    }

    public static BigInteger  factorial(int no) {

        if(no<0) {
            return BigInteger.ONE;
        }

        BigInteger res = BigInteger.ONE;
        for (int i=2;i<=no;i++) {
            res = res.multiply(new BigInteger(String.valueOf(i)));
        }
        return res;
    }

}
