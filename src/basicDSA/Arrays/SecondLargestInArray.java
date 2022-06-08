package basicDSA.Arrays;

public class SecondLargestInArray {
    public static int getSecondLargestInArray(int []arr){
        if(arr.length==1)return arr[0];
        else if (arr.length==2)return Math.min(arr[0],arr[1]);
        else {
            int max=Math.max(arr[0],arr[1]);
            int smax=Math.min(arr[0],arr[1]);
            for(int i=2;i<arr.length;i++)
            {
                // if curr ele greater the max
                int curr=arr[i];
                if(curr>max){
                    smax=max;
                    max=curr;
                }
                else if(curr>smax) {
                    smax = curr;
                }
            }
            return smax;
        }
    }
}
