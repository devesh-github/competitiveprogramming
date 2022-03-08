package Switch;

public class a {
      public static void main(String[] args) {
        String r = "-";
        char[] c = {'a', 'b', 'c', 'z'};
        for(char c1: c)
          switch (c1) {
            case 'a': r += "a";
            case 'b': r += "b"; break;
            default: r += "X";
            case 'z': r+= "z";
          }
        System.out.println(r);
    } }
