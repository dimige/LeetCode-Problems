/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodeexcersizes;

/**
 *
 * @author dimitris.georgiadis
 */
public class P344_Reverse_String {
    
        public static void main(String[] args) { 
            /*Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input:  ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input:  ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

*/
            char[] input1 =  {'h','e','l','l','o'};
            char[] input2 =  {'H','a','n','n','a','h'};
            char[] input3 = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'} ;
            
            
            System.out.println("input1 = "+ String.copyValueOf(input1));
            System.out.println("output1 = " + String.copyValueOf( reverseString(input1)  ) ) ;
            
            System.out.println("input2 ="+String.copyValueOf(input2));
            System.out.println("output2 = "+String.copyValueOf(reverseString(input2)));
            
            System.out.println("input3 ="+String.copyValueOf(input3));
            System.out.println("output3 = "+String.copyValueOf(reverseString(input3)));
            
        }
        
        
        public static char[]  reverseString(char[] s) {
            int dest = s.length-1 ;
            for (int i=0 ; i<s.length; i++) {
                char swapped = s[i];
                s[i] = s[dest];
                s[dest] = swapped;
                dest--;
                if (i>= (s.length/2)-1)
                    break;
            }
            return s;
         }
}


/*
abc
0123

sw 
0

i
0

dest
3



*/
