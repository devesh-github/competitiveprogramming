package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    
    public static void main(String... args) {

        Pattern p = Pattern.compile("a+b?c*");
        Matcher m = p.matcher("ab");
        boolean b = m.matches();
        System.out.println(b);
        System.out.println(p);

        
    }
}

