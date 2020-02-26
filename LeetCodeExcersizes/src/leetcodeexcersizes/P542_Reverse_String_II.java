package leetcodeexcersizes;

public class P542_Reverse_String_II {

    /*
    Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. 
    If there are less than k characters left, reverse all of them. 
    If there are less than 2k but greater than or equal to k characters, 
    then reverse the first k characters and left the other as original.

    Example:

    Input: s = "abcdefg", k = 2
    Output: "bacdfeg"
     */
    public static void main(String[] args) {
        P542_Reverse_String_II solution = new P542_Reverse_String_II();
        String input1 = "abcdefg";
        int k = 2;

        String output1 = solution.reverseStr(input1, k);

        System.out.println("For input : " + input1 + " and k=" + k + " output is: " + output1);

    }

    public String reverseStr(String s, int k) {
        System.out.println("Starting: "+s);
        char[] chars = s.toCharArray();

        int currentGroupPos = 0;
        int curGroupNum =1 ; 
        for (int i = 0; i < chars.length; i++) {
            System.out.println("i: "+i+ "  gPos: "+currentGroupPos+" : "+ chars[i]) ; 
            if (currentGroupPos < k) {
                //Reverse characters here
                int dest = ((curGroupNum*k)-1)-(currentGroupPos*curGroupNum) ;
                if (currentGroupPos < k-1){
                    System.out.println("reversing character: " + chars[i] + " at index: " + i + " current Group Position: " + currentGroupPos+" Dest: "+dest);
                    char swapped = chars[i];
                    chars[i] = chars[dest];
                    chars[dest]=swapped;
                    System.out.println( String.valueOf(chars));
                }
            }

            currentGroupPos++;
            if (currentGroupPos == (2 * k) ) {
                currentGroupPos = 0;
                curGroupNum ++;
            }
        }

        return String.valueOf(chars);
    }
/*
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
    */
}
