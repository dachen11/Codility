// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        int[] b = new int[A.length];
        if(A.length <= 1) return A;
        for(int i = 0; i < K; i++) {
            for(int j = 0; j < A.length; j++) {
                int index = (j+1) % A.length;
                b[index] = A[j];
            }
            for(int k = 0; k < A.length; k++) {
                A[k] = b[k];
            }
        }
        return A;
    }
}
