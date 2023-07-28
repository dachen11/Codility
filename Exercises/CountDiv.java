/*
Attempt 5
i think i'll expand the equation this time
so instead of B - A / K do B/K - A/K cuz that's kind of what i was doing when i was figuring it out-- 
like [1,20,6] --> 6 * X <= 20, X = 3
There's a + 1 in there somewhere tho cuz A is included so if A is divisible by K then add 1 extra
gotta go to church after this
Score: 100%
bruh
i hate coding sometimes
actually this wasn't even coding this was just math
*/

class Solution {
    public int solution(int A, int B, int K) {
        // Implement your solution here
        int test = (B / K) - (A / K);
        if(A % K == 0) {
            test++;
        }
        return test;
    }
}

/* 
Attempt 4....
This is the most attempts I've done on a problem tbh
but i ain't gonna give you up ain't ever gonna let you down 
i put in a bunch of edge cases for this one cuz i don't really know the rules

Score: 50%: half correct half performance
*/
class Solution {
    public int solution(int A, int B, int K) {
        // Implement your solution here
        if(B == 0) {
            return 1;
        }
        if(B < K) {
            return 0;
        }
        if(B == K || B < K * 2) {
            return 1;
        }
        return (B - A) / K + 1;
    }
}



/*
Attempt 3:
tried doing it the straightforward way because my computer was gonna die in a bit
totally not because i was too lazy to figure out the algorithm
Score: 50%
It's confirmed: O(n) is too damn long (or O(B-A))
*/

//the straightforward way's in attempt 1 


/*
Attempt 2:
Score: 25%
Tweaked the algorithm by not using Math.round and just doing what Math.round was supposed to do but manually
...
All the test answers are off by either 1 or 2...
*/



class Solution {
    public int solution(int A, int B, int K) {
         double test = ((double)B - A + 1) / K;
         return (int)(test + .5);
    }
}



/*
Attempt 1
Score: 12%

The straighforward answer was to do a for loop. But the straightforward answer is usually wrong...
So the right answer is figure out an algorithm.
After screwing around with some numbers, I got the result below...
...
I think Math.round didn't work because int division...
*/

class Solution {
    public int solution(int A, int B, int K) {
        // Implement your solution here
        // int count = 0;
        // for(int i = A; i <= B; i++) {
        //     if(i % K == 0) {
        //         count ++;
        //     }
        // }
        // return count;
        return Math.round((B - A + 1) / K);
    }
}
