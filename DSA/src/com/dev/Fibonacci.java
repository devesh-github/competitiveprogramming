/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            //System.out.println(string);
        }

        System.out.println(getFib(3));
        System.out.println(getFib(0) == 0);
        System.out.println(getFib(1) == 1);
        System.out.println(getFib(2) == 1);
    }

    //0 1 1 2 3
    public static int getFib(int a) {
        int fib = 0;
        int s=0;
        int n=1;
        if(a==0) {
            return 0;
        } else if(a==1) {
            return 1;
        } else if(a<0) {
            return -1;
        }

        for(int i=2;i<=a;i++) {
            fib = s + n;
            s=n;
            n=fib;
        }
        return fib;
    }
}