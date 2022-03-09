package com.dev.dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */

public class DecodedStringatIndex {

    /*public String decodeAtIndex(String S, int K) {
        Map<String,Integer> mp = new LinkedHashMap<String,Integer>();
        StringBuilder sb = new StringBuilder();
        StringBuilder prev = new StringBuilder();
        StringBuilder toRepeat = new StringBuilder();
        int count = 0,prc=-1;
        for(char c:S.toCharArray()) {
            if(sb.length()<K) {
                if(Character.isDigit(c)) {
                    Integer n = Integer.valueOf(String.valueOf(c));
                    System.out.println("count:"+count);
                    System.out.println("prc:"+prc);
                    if(count-1 == prc) {
                        toRepeat = sb;
                        prev = toRepeat;
                    } else {
                        toRepeat = prev.append(sb);
                        prev = toRepeat;
                    }
                    prc = count;
                    System.out.println("n"+n);
                    String toRepeatStr = toRepeat.toString();
                    mp.put(toRepeatStr,mp.get(toRepeatStr)!=null?mp.get(toRepeatStr)*n:n);
                    while(n>1) {
                        //System.out.println("n::"+n);
                        //System.out.println("sb::"+sb);
                        //System.out.println("toRepeat::"+toRepeat);
                        sb.append(toRepeat);
                        //System.out.println("sbpost::"+sb);
                        n--;
                    }
                } else {
                    sb.append(c);
                }
                count++;
            } else {
                break;
            }
        }
        System.out.println("mp::"+mp);
        return returnEle(sb,K,mp);
    }*/

    public String decodeAtIndex(String S, int K) {
        int N = S.length();
        long size = 0;

        // finding size = length of new string S'
        for (int i = 0; i < N; ++i)
        {
            if (Character.isDigit(S.charAt(i)))
            {
                size = size * (S.charAt(i) - '0');
            }
            else
            {
                size += 1;
            }
        }

        // get the K-th letter
        for (int i = N - 1; i >= 0; --i)
        {
            K %= size;
            if (K == 0 && Character.isAlphabetic(S.charAt(i)))
            {
                return (String) "" + S.charAt(i);
            }

            if (Character.isDigit(S.charAt(i)))
            {
                size = size / (S.charAt(i) - '0');
            }
            else
            {
                size -= 1;
            }
        }
        return null;
    }

    public String returnEle(StringBuilder sb, int K,Map<String,Integer> mp) {
        /*char[] ca = sb.toString().toCharArray();
        if(ca!=null)
            return String.valueOf(ca[K-1]);
        for(Map.Entry<String,Integer> e: mp.entrySet()){
            if(e.getKey()*e.getValue()>K) {
                for()
            }
        }*/
        return "";
    }

}
