package dcp.leetcode;

import java.util.Stack;

/**
 * Created by My PC on 2/1/2021.
 */
public class ValidParanthesis {

    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        char[] ca = s.toCharArray();
        for(char c: ca) {
            if(c == ')' && st.size()>0 && "(".equalsIgnoreCase(st.peek())) {
                st.pop();
            } else if(c == '}' && st.size()>0 && ("{").equalsIgnoreCase(st.peek())) {
                st.pop();
            } else if(c == ']' && st.size()>0 && ("[").equalsIgnoreCase(st.peek())) {
                st.pop();
            } else {
                st.push(Character.toString(c));
            }
        }
        return st.size() == 0;
    }

}
