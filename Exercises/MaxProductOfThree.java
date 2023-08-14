/*
Attempt 5: 77%
*/
class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        if(A.length == 3) { 
            return A[0] * A[1] * A[2];
        }
        int pos1 = 0; 
        int pos2 = 0;
        int pos3 = 0;
        int neg1 = 0;
        int neg2 = 0;
        int neg3 = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > pos1) {
                pos3 = pos2;
                pos2 = pos1;
                pos1 = A[i];
            } else if(A[i] > pos2) {
                pos3 = pos2;
                pos2 = A[i];
            } else if(A[i] > pos3) {
                pos3 = A[i];
            }

            if(A[i] < neg1) {
                neg3 = neg2;
                neg2 = neg1;
                neg1 = A[i];
            } else if(A[i] < neg2) {
                neg3 = neg2;
                neg2 = A[i];
            } else if(A[i] < neg3) {
                neg3 = A[i];
            }
        }
        int max1 = pos1 * pos2 * pos3;
        int max2 = pos1 * neg1 * neg2;

        if(pos1 == 0) {
            return neg1 * neg2 * neg3;
        }

        if(max1 > max2) {
            return max1;
        }


        return max2;
    }
    
}
/*
Attempt 2 because Attempt 1 was just so bad: 44%
Attempt 3 bumped up to 55%
Attempt 4: 77%
forgot about edgecases like 3 negative numbers
*/

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        if(A.length == 3) { 
            return A[0] * A[1] * A[2];
        }
        int pos1 = 0; 
        int pos2 = 0;
        int pos3 = 0;
        int neg1 = 0;
        int neg2 = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > pos1) {
                pos3 = pos2;
                pos2 = pos1;
                pos1 = A[i];
            } else if(A[i] > pos2) {
                pos3 = pos2;
                pos2 = A[i];
            } else if(A[i] > pos3) {
                pos3 = A[i];
            }

            if(A[i] < neg1) {
                neg2 = neg1;
                neg1 = A[i];
            } else if(A[i] < neg2) {
                neg2 = A[i];
            }
        }
        int max1 = pos1 * pos2 * pos3;
        int max2 = pos1 * neg1 * neg2;

        if(max1 > max2) {
            return max1;
        }


        return max2;
    }
    
}
