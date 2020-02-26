package leetcodeexcersizes;

public class P1342_NumberOfStepsToReduceNumberToZero {
 
    
        /*Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
Example 1:
Input: num = 14
Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.
   
    
Example 2:
Input: num = 8
Output: 4
Explanation: 
Step 1) 8 is even; divide by 2 and obtain 4. 
Step 2) 4 is even; divide by 2 and obtain 2. 
Step 3) 2 is even; divide by 2 and obtain 1. 
Step 4) 1 is odd; subtract 1 and obtain 0.

Example 3:
Input: num = 123
Output: 12

    
    */
    
    public static void main(String[] args){
        P1342_NumberOfStepsToReduceNumberToZero solution = new P1342_NumberOfStepsToReduceNumberToZero();
        int input1 = 14; 
        int input2 = 8; 
        int input3 = 123;
        int output1 = solution.numberOfSteps(input1);
        int output2 = solution.numberOfSteps(input2);
        int output3 = solution.numberOfSteps(input3);
        
        System.out.println("For input : "+input1+" output is: "+output1);
        System.out.println("For input : "+input2+" output is: "+output2);
        System.out.println("For input : "+input3+" output is: "+output3);
    
    }
    
    
    public int numberOfSteps (int num) {
        /*Given a non-negative integer num, return the number of steps to 
        reduce it to zero. If the current number is even, 
        you have to divide it by 2, otherwise, you have to subtract 1 from it.*/
        
        int steps = 0; 
        
        while(num>0){
            if(num==0){
                break;
            }
            
            if (num%2==0){
                num = num/2 ;
            } else {
                num = num - 1 ; 
            }
            steps = steps+1;
            
        }
        return steps;
        
    }
    
}
