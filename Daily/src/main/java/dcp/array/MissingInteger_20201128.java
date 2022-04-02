package dcp.array;

import java.util.Arrays;

/**
 * Created by My PC on 11/28/2020.
 */
public class MissingInteger_20201128 {

    // you can also use imports, for example:
//

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int count = 0;
        for (int i = 0, j = 1; i < A.length; i++, j++) {
            if (A[i] > 0 && j < A.length && (A[i] == A[j] || A[i] + 1 == A[j])) {
                continue;
            } else if (A[i] < 0 && j < A.length && A[j] != 1) {
                return 1;
            } else {
                return A[i] + 1;
            }
        }
        return 1;
    }

    public int singleMissingNumber(int[] A){
        int missingNum = A[0];
        for(int i = 1; i < A.length; i++){
            missingNum ^= A[i];
        }
        return missingNum;
    }

    public static void main(String[] args) {
        int[] A = new int[]{3,6,1,4};
        System.out.print(new MissingInteger_20201128().solution(A));
    }

}
