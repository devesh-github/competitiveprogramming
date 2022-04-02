public class FactorialOfaNumber {

    public static void main(String[] args) {
        System.out.println(FactorialOfaNumber.factorial(10));
    }

    public static int factorial(int no) {

        if(no<0) {
            return 1;
        }

        int res = 1;
        for (int i=1;i<=no;i++) {
            res = res * i;
        }
        return res;
    }

}
