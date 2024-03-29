/*
Attempt 2: 100%
The issue with the performance error was that total overflowed which is why the alg returned negative 1 billion something instead of negative 1
Changes:
moved the "check total > 1 billion" into the for loop
Put an extra if statement to make sure that total isn't less than 0 (just in case)

*/

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int increment = 0;
        int total = 0;
        for(int i = 0; i < A.length ; i++) {
            if(A[i] == 0) {
                increment++;
            } else { //the problem says it can only have 0s or 1s
                total += increment;
                if(total > 1000000000) { //yeah this is a billion
                    return -1;
                }
            }
        }
        if(total < 0) {
            return -1;
        }
        return total;
    }
}


/*
Attempt 1: 90%. 100% correct but 80% performance

Thought process:
Assume an array where you have 1 zero and like 27 ones in that order. How many pairs are there? 27, right.
But what if you add in another zero, say, three ones after the first? Then, if you proceed through the array, one by one, it looks something like this:
+0 (0) +1, +1, +1, (0), +2 (because both the first zero and the second can make pairs), +2...
So you need a variable for the "increment" and a variable for the total

...
The time was O(n) so apparently that's not good enough...
Oh wait, never mind, one of the performance tests gave the wrong answer...
pretty sure i put 9 zeroes right
*/

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int increment = 0;
        int total = 0;
        for(int i = 0; i < A.length ; i++) {
            if(A[i] == 0) {
                increment++;
            } else { //the problem says it can only have 0s or 1s
                total += increment;
            }
        }
        if(total > 1000000000) { //yeah this is a billion
            return -1;
        }
        return total;
    }
}
