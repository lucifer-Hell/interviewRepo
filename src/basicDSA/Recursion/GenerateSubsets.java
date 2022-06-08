package basicDSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {
    public static void generateSubsets(String str, int i, List<String>list,String temp){
        if(i>=str.length()){
            return;
        }
        list.add(temp+str.charAt(i));
        generateSubsets(str,i+1,list,temp+str.charAt(i));
        generateSubsets(str,i+1,list,temp);
    }
    public static void printAllSubsets(String str){
        List<String >list=new ArrayList<>();
        generateSubsets(str,0,list,"");
        System.out.println(list);
    }
}
