package com.dev.dcp.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by My PC on 9/6/2020.
 */
public class LongestPalindrom_20200906 {

    public static void main(String[] args) {
        LongestPalindrom_20200906.longestPalindrome("babad");
    }

    public static String longestPalindrome(String s) {
        char[] sArr = s.toCharArray();
        List<String> palindroms = new ArrayList<>();
        for (int i = 0; i < sArr.length - 1; i++) {
            int k = i;
            for (int j = sArr.length - 1; j < i; j--) {
                if (sArr[i] == sArr[j]) {
                    int m = i, n = j;
                    for (; m < n; m++, n--) {
                        if (sArr[m] == sArr[n]) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    if (m == n) {
                        //palindroms.add(j - 1);
                        palindroms.add(s.substring(i, j));
                    }
                }
            }
        }
        System.out.println(palindroms);
        return "";
    }
}