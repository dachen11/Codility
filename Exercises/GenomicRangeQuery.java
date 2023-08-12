/*
Attempt 1: 20% Correct, 33% Performance
The straightforward answer is use a for loop with .contains() 
I expected this to fail as for loop x contains() = O(n^2)
...
I didn't think it would be completely wrong, though.
I guess my code's off somewhere.
*/

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // Implement your solution here
        int[] arr = new int[P.length];

        for(int i = 0; i < P.length; i++) {
            String chars = S.substring(P[i], Q[i]);
            if(chars.contains("A")) {
                arr[i] = 1;
            } else if(chars.contains("C")) {
                arr[i] = 2;
            } else if(chars.contains("G")) {
                arr[i] = 3;
            } else {
                arr[i] = 4;
            }
        }

        return arr;
    }
}
