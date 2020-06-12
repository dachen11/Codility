// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int minDiff = 2000;
        int p = 1;
        int start = A[0];
        int end = 0;
        for(int i = 1; i < A.length; i++) {
            end += A[i];
        }
        for(p = 1; p < A.length; p++) {
            int absDiff = Math.abs(end-start);
            if(minDiff > absDiff) minDiff = absDiff;
            end -= A[p];
            start += A[p];
        }
        return minDiff;
    }
}
