/*
Attempt 1: 100%

A HashSet only has unique values. So... just add everything to a HashSet and return the size of it at the end.
*/

// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            h.add(A[i]);
        }
        return h.size();
    }
}
