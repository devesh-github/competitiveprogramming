package dcp.stack;

import java.util.Stack;


/**
 * Created by My PC on 11/16/2020.
 */
public class ParanthesisBalancing {

    public static void main(String[] args) {
        ParanthesisBalancing pb = new ParanthesisBalancing();
        //System.out.println(pb.isValid("[{()}]"));
        System.out.println(pb.isValid("]"));
    }

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


