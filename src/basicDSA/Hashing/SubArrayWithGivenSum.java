package basicDSA.Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static boolean checkForSubArrayWithGivenSum(int []arr,int sum){
        HashSet<Integer>prefixSum=new HashSet<>();
        int prefix=0;
        for(int ele:arr)
        {
            prefix+=ele;
            if(prefixSum.contains(prefix-sum)) {

                    System.out.println("found at ele "+ele);
                    return true;
            }
            if(prefix==sum)
                return true;
            prefixSum.add(prefix);
        }
        return false;
    }
}
