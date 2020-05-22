// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int len = 0;
        int highestExp = -1;
        while(Math.pow(2,highestExp) <= N) {
            highestExp++;
        }
        highestExp--;
        String binary = "";
        for(int i = highestExp; i >= 0; i--) {
            if(N - Math.pow(2, i) >= 0) {
                N -= Math.pow(2, i);
                binary += "1";
            }
            else {
                binary += "0";
            }
        }
        int max = 0;
        for(int i = 0; i < binary.lastIndexOf("1"); i++) {
            if(binary.charAt(i) == '0') {
                len++;
                if(max < len) max = len;
            }
            else len = 0;
        }
        return max;
    }
}
