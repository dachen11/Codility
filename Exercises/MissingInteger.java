/*
Attempt 1: 100%
Thought process was similar to FrogRiver1 or PermCheck: 
Use a hashset and remove elements as you go through array A

if the set is empty then Array A contained all the numbers from 1 to A's length and thus the smallest is A's length + 1
Else return the first number in the set-- using a hashset because remove is O(1) compared to an ArrayList and Arrays don't have a good remove other than setting stuff to -1
Alternatively I guess I could've done the array-- just set stuff to -1
and at the end check what isn't -1, if it's all -1 then just return A.length + 1 else return the first thing that isn't -1.
oh wait no that doesn't work oops
*/

// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= A.length; i++) {
            set.add(i);
        }
        for(int i = 0; i < A.length; i++) {
            set.remove(A[i]);
        }
        if(set.isEmpty()) {
            return A.length + 1;
        }

        int smallest = 0;
        for(int i : set) {
            smallest = i;
            break;
        }

        return smallest;
    }
}
