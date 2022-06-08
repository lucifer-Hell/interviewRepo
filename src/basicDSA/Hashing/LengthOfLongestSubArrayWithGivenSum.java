package basicDSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubArrayWithGivenSum {
    public static int getLengthOfLongestSubArrayWithGivenSum(int []arr,int sum){
        int prefix=0;
        int maxLen=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(sum==prefix){
                maxLen=Math.max(maxLen,i+1);
            }
            if(map.containsKey(prefix-sum)){
                int idx=map.get(prefix-sum);
                maxLen=Math.max(maxLen,i-idx);
            }
            if(!map.containsKey(prefix)) map.put(prefix,i);
        }
        return maxLen;
    }
}
