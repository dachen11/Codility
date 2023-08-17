/*
Attempt 2: 100% 
Declined to put attempt 1 because I forgot and also did not care enough to
Originally tried to use a for loop (attempt 1) with a bunch of if-statements but it didn't work out due to certain cases like ')('
as what i was doing was checking if the i'th character in S matched up with the S.length -1 - i 'th character in S aka trying to figure out if S was symmetric
this does not work as )( is symmetric but is not enclosed.

Which ended in me using a Stack-->
A for loop traverses the string character by character
A stack (not a queue) is used because it's FIFO or first in first out and it's used to contain the characters '{, (, ['
When the matching character '), ], }' is encountered, the stack pops out the most recently added character and checks if they match
I don't remember if it's from a similar exercise but I did this because I remembered that "( [ ) ]" isn't really enclosed 
and in hindsight after typing that out I've also realized that it's not symmetric and I'm just stupid

anyway it's a stack (i keep calling it a queue) with a for loop and a bunch of ifs 
also i had to check if the stack was empty or not in two different places cuz it gave me an error when i was running the ")(" test case
*/

class Solution {
    public int solution(String S) {
        // Implement your solution here
        int l = S.length();
        if(l % 2 != 0) {
            return 0;
        }
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < l; i++) {
            char c = S.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            if(c == ')' || c == '}' || c == ']') {
                if(st.isEmpty()) {
                    return 0;
                }
                char end = st.pop();
                
                if(end == '(' && c != ')') {
                    return 0;
                }
                if(end == '[' && c != ']') {
                    return 0;
                }
                if(end == '{' && c != '}') {
                    return 0;
                }
            }
        }
        if(!st.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
