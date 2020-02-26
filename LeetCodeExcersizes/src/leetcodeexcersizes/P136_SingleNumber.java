/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodeexcersizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dimitris.georgiadis
 */
public class P136_SingleNumber {
        public static void main(String[] args) { 
            int[] input = {4, 2, 2 , 1 ,1 ,3, 3, 4 ,5 ,4} ; 
            System.out.println("result="+singleNumber(input));
        
        }
    
        
        public static int singleNumber(int[] nums) { 
            for (int testedIndex =0 ; testedIndex <nums.length ; testedIndex++) { 
               //for each tested index, iterate through entire array, checking if it appears again.
               //if the answer is no up to the last element, then testedIndex is unique.
               //Note, that during checking, you must exclude the tested intex itself, otherwise you are testing it against itself.
               for (int curCheck = 0 ; curCheck < nums.length; curCheck++){
                   if (curCheck == testedIndex)
                       continue;
                   if (nums[testedIndex] == nums[curCheck])
                       break; //abort this testedIndex, we have a duplicate at location curCheck
                
                   if (curCheck == nums.length-1) {
                    //If reaching this point, we went through the entire array without encountering a duplicate, so this is the answer.
                    return nums[testedIndex];
                   }
               }
                
            }
            return -1 ; 
        }
}
