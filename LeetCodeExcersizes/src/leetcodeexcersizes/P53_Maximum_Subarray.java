package leetcodeexcersizes;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collections;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

public class P53_Maximum_Subarray {
    public static void main(String[] args) { 
       int[] testNums = {-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(maxSubArray(testNums));
    }
    /*my wrong approach
    public static int maxSubArray(int[] nums) {
        
        int maxSumEncountered = nums[0]; 
        int currentSum = 0 ; 
        
        for (int i = 0 ; i< nums.length; i ++) {
            System.out.println("i="+i);
            for (int j=0 ; j <=i ; j++) {
                
                for (int k=nums.length-1; k>j; k--){
                
                System.out.println("j="+j);
                currentSum += nums[k];
                }
                if (currentSum>maxSumEncountered){
                 maxSumEncountered = currentSum;
                    }
                   currentSum=0;
 
            }
            
            
        
        }        
        return maxSumEncountered; 
        
    }*/

    /*found on discuss */
    public static int maxSubArray(int[] nums) {
       int sum = nums[0];
            int largestSum = nums[0];
            for(int i = 1; i< nums.length; i++){
                sum = Math.max(nums[i], sum + nums[i]);
                largestSum = Math.max(sum, largestSum);
            }
            return largestSum;
    }
}
