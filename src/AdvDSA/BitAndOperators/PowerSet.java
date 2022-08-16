package AdvDSA.BitAndOperators;

import java.util.ArrayList;

public class PowerSet {

    public static void main(String[] args) {
        generatePowerSet("abc");
    }

    private static void generatePowerSet(String str) {
        int len=str.length();
        ArrayList<String>arr=new ArrayList<>();
        for(int i=0;i<Math.pow(2,len);i++){
            arr.add(getStr(str,i));
        }
        System.out.println(arr);
    }

    private static String getStr(String str, int i) {
        String ans="";
        int idx=0;
        while(i>0){
            if((i&1)==1)ans+=str.charAt(idx);
            i=i>>1;
            System.out.println("curr val of i "+i);
            idx++;
        }
        return ans;
    }
}
