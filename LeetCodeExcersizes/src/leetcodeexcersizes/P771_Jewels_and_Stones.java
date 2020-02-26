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
public class P771_Jewels_and_Stones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String J = "z" ;
        String S = "axAzAbZbzzbb" ; 
     
        int c=0;
        char[] x = J.toCharArray();
        char[] y = S.toCharArray();
        for(char j:y){
            for(char i:x){
                if(i==j){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    
}
