/*
Attempt 2 because Attempt 1 was just so bad: 44%

forgot about edgecases like 3 negative numbers
*/

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        if(A.length == 3) { //added on from attempt 3, bumped up to 55%
            return A[0] * A[1] * A[2];
        }
        int pos1 = 1;
        int pos2 = 1;
        int pos3 = 1;
        int neg1 = 1; //added on from attempt 4
        int neg2 = 1;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > pos1) {
                pos3 = pos2;
                pos2 = pos1;
                pos1 = A[i];
            } else if(A[i] > pos2) {
                pos3 = pos2;
                pos2 = A[i];
            } else if(A[i] > pos3) {
                pos3 = pos2;
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
