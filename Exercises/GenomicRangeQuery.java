/*
Attempt 2: 100%

Objective 1: compute the total number of each letter (except T) from 0 to N where N is an index in S
Objective 2: Iterate over the length of P and compute the number of each letter from 0 to Q[n] - 0 to P[n] and that will be the number of each letter from P[n] to Q[n]
and then return the array
*/
class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // Implement your solution here
        int[] arr = new int[P.length];

        int[] a = new int[S.length() + 1];
        int[] c = new int[S.length() + 1];
        int[] g = new int[S.length() + 1];

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'A') {
                a[i+1] = a[i] + 1;
                c[i+1] = c[i];
                g[i+1] = g[i];
            }
            else if(S.charAt(i) == 'C') {
                a[i+1] = a[i];
                c[i+1] = c[i] + 1;
                g[i+1] = g[i];
            }
            else if(S.charAt(i) == 'G') {
                a[i+1] = a[i];
                c[i+1] = c[i];
                g[i+1] = g[i] + 1;
            } else {
                a[i+1] = a[i];
                c[i+1] = c[i];
                g[i+1] = g[i];
            }
        }
        int n = P.length;

        for(int i = 0; i < n; i++) {
            int As = a[Q[i] + 1] - a[P[i]];
            int Cs = c[Q[i] + 1] - c[P[i]];
            int Gs = g[Q[i] + 1] - g[P[i]];

            if(As > 0) {
                arr[i] = 1;
            } else if(Cs > 0) {
                arr[i] = 2;
            } else if(Gs > 0) {
                arr[i] = 3;
            } else {
                arr[i] = 4;
            }
        }
        return arr;
    }
}



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
