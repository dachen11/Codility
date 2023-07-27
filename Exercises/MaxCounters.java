/*
Attempt 1: 100%
So the main thing about most of these questions is that the straightforward answer doesn't work. Or rather, it works sometimes for correctness, but it's not efficient.
In other words, the general Big O notation time thing has to be O(n) at the max
Which means no double for loops.
So let's look at the question:
If the number in Array A is between 1 and N, increase the counter by 1
But if the number = N + 1, set everything to the max. 

Therefore, you need to keep track of what the max is but also the max at the time the N+1 Number popped up.
So a max and a min.
And because the number is either between 1 and N or is N+1, the index has to be down 1.
Since you can't do double for loops, you need an extra for loop at the end to update anything below the min to the min.

*/

class Solution {
    public int[] solution(int N, int[] A) {
        // Implement your solution here
        int min = 0;
        int max = 0;

        int[] arr = new int[N];

        for(int i = 0; i < A.length; i++) {
            if(A[i] >= 1 && A[i] <= N) {
                if(arr[A[i] - 1] < min) {
                    arr[A[i] - 1] = min;
                }
                
                arr[A[i] - 1]++;
                if(arr[A[i] - 1] > max) {
                    max = arr[A[i] - 1];
                }
            }
            if(A[i] == N + 1) {
                min = max;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                arr[i] = min;
            }
        }

        return arr;
    }
}
