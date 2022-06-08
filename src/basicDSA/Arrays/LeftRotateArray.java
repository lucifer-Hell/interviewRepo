package basicDSA.Arrays;

import java.util.Arrays;

public class LeftRotateArray {
    public static void leftRotateArray(int []nums,int rotateBy){
        rotateBy=rotateBy%nums.length;
        reverse(nums,rotateBy,nums.length-1);
        reverse(nums,0,rotateBy-1);
        reverse(nums,0,nums.length-1);
        System.out.println("leftRotatedArray - "+ Arrays.toString(nums));
    }
    public static void  reverse(int []nums,int l,int r){
        while(l<=r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}
