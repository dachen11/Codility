// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int odd = A[0];
        boolean checkedLast = true;
        for(int i = 0; i < A.length-1; i+=2) {
            if(A[i] != A[i+1]) {
                odd = A[i];
                checkedLast = true;
                break;
            }
            else checkedLast = false;
        }
        if(checkedLast == false) return A[A.length-1];
        return odd;
    }
}
