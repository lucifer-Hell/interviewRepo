package Contests.Leetcode.Weekly.Contest_301;

import java.util.Arrays;

public class MovePieces {
    public static boolean canChange(String start, String target) {
        int i=0,j=0,n=start.length(),m=target.length(),k=0;
        while (j<m){
            char c=target.charAt(j);
            if(c!='_'){
                if(c=='L'){
                    // search for l in right
                    boolean found=false;
                    while( k<m && !found){
                        if(start.charAt(k)=='R')
                            return false;
                        else if( start.charAt(k)=='L')
                            found=true;
                        else k++;
                    }
                    if(found){
                        start=swap(j,k,start);
                    }
                    else return false;
                }
                else{
                    // search for r in left
                    boolean found=false;
                    while( k>0 && !found){
                        if(start.charAt(k)=='L')
                            return false;
                        else if( start.charAt(k)=='R')
                            found=true;
                        else k--;
                    }
                    if(found){
                        start=swap(j,k,start);
                    }
                    else return false;
                }
            }
            j++;
        }
        return (start==target);
    }

    private static String swap(int j, int k,String start) {
        char []arr=start.toCharArray();
        char temp=arr[k];
        arr[k]=arr[j];
        arr[j]=temp;
        return new String(arr);
    }

    public static void main(String[] args) {
       System.out.println( canChange("_L__R__R_","L______RR"));
    }
}
