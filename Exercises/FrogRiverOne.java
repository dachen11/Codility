/*
Attempt 2: 
Use a HashSet and store the numbers from 1 to X
Proceed through the list and remove the number from the set if it is there
When the list is empty, return the index
If the list is not empty, return -1

Score: 100% Correct, 100% Performance due to it being O(n)
For loop = O(n), HashSet remove = O(1)
*/
import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        HashSet<Integer> nums = new HashSet<>();
        for(int i = 0; i < X; i++) {
            nums.add(i);
        }
        for(int i = 0; i < A.length; i++) {
            nums.remove(A[i]);
            if(nums.isEmpty()) return i;
              
        }
        return -1;
    }
}





//------------------------------------------

/*
Attempt 1:
Use an ArrayList to store numbers between 1 and X, as long as the number is not in the list.
At the same time, keep track of the "largest index" stored in the list.
If you've reached the end of A and the list's size < X, return -1. Else, return the "largest index"

Score: 100% Correct, 54% Performance due to it being O(n^2):
For loop = O(n), ArrayList contains() = O(n) --> O(n^2)
*/
import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        // Implement your solution here
        int index = 0;
        boolean complete = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
       
        int greatest = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] < X+1 && A[i] > 0 && !list.contains(A[i])) {
                list.add(A[i]);
                if(i > greatest) greatest = i; //don’t need the if statement on hindsight
            }
        }
        //System.out.println(Arrays.toString(list.toArray()));
        if(list.size() < X) {
            return -1;
        }
        return greatest;
    }
