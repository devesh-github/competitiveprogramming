package dcp.common;

import java.math.BigInteger;

public class FactorialOfaNumberRecursion {

    public static void main(String[] args) {
        System.out.println(FactorialOfaNumberRecursion.factorial(25000));
    }

    public static int  factorial(int no) {
        if(no==0) {
            return 1;
        } else {
            return no * factorial(no-1);
        }
    }

}
