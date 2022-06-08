package basicDSA.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static boolean checkForSubArrayWithZeroSum(int []arr){
        int prefix=0;
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr)
        {
            prefix+=ele;
            if(set.contains(prefix) || prefix==0)
                return true;
            set.add(prefix);
        }
        return false;
    }
}
