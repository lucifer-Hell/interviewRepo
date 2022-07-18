package Contests.Leetcode.Weekly.Contest_301;

public class MovePieces {
    public static boolean canChange(String start, String target) {
        int si=0,ti=0,n=start.length();
        while(si<n || ti<n){
            while (si<n && start.charAt(si)=='_')si++;
            while (ti<n && target.charAt(ti)=='_')ti++;
            if(si>=n || ti>=n){
                // if anyone idx reaches to end that means all chars have been found
                // if other doesnot reaches to end that means it have some extra characters which are not valid
                return (si==n && ti==n);
            }
            char sc=start.charAt(si);
            char tc=target.charAt(ti);
            if(sc!=tc)return false;
            if ((tc=='L' && si<ti) || (tc=='R' && si>ti))return false;
            si++;ti++;
        }
        return true;
    }



    public static void main(String[] args) {
       System.out.println( canChange("_L","LL"));
    }
}
