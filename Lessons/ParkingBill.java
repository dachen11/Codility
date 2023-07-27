/*
Score: 100%. Performance: 100%
Attempt 1.
Figuring out the numbers was really annoying. I thought I could just use Integer.valueOf but it gave me the ASCII numbers instead...
I think I'm only realizing now I probably could've just done "x - 49" to get the actual numbers...
I need to stop getting tunnel vision.
*/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String E, String L) {
        // Implement your solution here
        String[] ee = E.split(":");
        String[] ll = L.split(":");
        int eH = 0, eM = 0, lH = 0, lM = 0;
        

        eH = (Integer.parseInt(String.valueOf(ee[0].charAt(0))) * 10) + Integer.parseInt(String.valueOf(ee[0].charAt(1)));

        eM = (Integer.parseInt(String.valueOf(ee[1].charAt(0))) * 10) + Integer.parseInt(String.valueOf(ee[1].charAt(1)));

        lH = (Integer.parseInt(String.valueOf(ll[0].charAt(0))) * 10) + Integer.parseInt(String.valueOf(ll[0].charAt(1)));

        lM = (Integer.parseInt(String.valueOf(ll[1].charAt(0))) * 10) + Integer.parseInt(String.valueOf(ll[1].charAt(1)));

        // System.out.println("EH: " + eH);
        // System.out.println("EM: " + eM);
        // System.out.println("lH: " + lH);
        // System.out.println("lM: " + lM);

        int cost = 5;
        int hours = lH - eH;
        int mins = lM - eM;

        if(mins < 0) {
            hours--;
            mins += 60;
        }
        if((hours == 0 && mins >= 0) || (hours == 1 && mins == 0)) {
            return cost;
        }
        if(mins > 0) {
            hours ++;
        }

        return cost + ((hours - 1) * 4);

    }
}
