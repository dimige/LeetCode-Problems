package leetcodeexcersizes;

import java.util.Arrays;

public class P1295_Find_Numbers_with_Even_Number_of_Digits {
/*  1295. Find Numbers with Even Number of Digits
Easy
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.

 

Constraints:

    1 <= nums.length <= 500
    1 <= nums[i] <= 10^5
*/
    public static void main(String[] args) {
        P1295_Find_Numbers_with_Even_Number_of_Digits solution= new P1295_Find_Numbers_with_Even_Number_of_Digits(); 
        int[] input1 = {12,345,2,6,7896}; 
        int[] input2 = {555,901,482,1771}; 
        int output1 = solution.findNumbers(input1);
        int output2 = solution.findNumbers(input2); 
        
        System.out.println("For input : "+Arrays.asList(input1)+" output is: "+output1);
        System.out.println("For input : "+Arrays.asList(input2)+" output is: "+output2); 
    }
    
    public int findNumbers(int[] nums) {
        int evenNums = 0 ; 
        for (int i: nums){
            if (0  ==  String.valueOf(i).length() % 2)   {
                evenNums ++;
            }
        }
        return evenNums ;
    }
    
}
