/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unsolved;

import java.util.Scanner;

/**
 *
 * @author Tamanna
 */
public class uva494 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String sentence = "", sepWords[];
        int noOfWords;
        
        while (scan.hasNext()) {
            noOfWords = 0;
            sentence = scan.nextLine();
            sepWords = sentence.split(" ");
            
            for (String word : sepWords) {
                if (word.length() > 0) {
                    int charValue = (int) word.charAt(0); 
                    if((charValue >= 65 && charValue <= 90) || (charValue >= 97 && charValue <= 122)){
                        noOfWords++;
                    }
                }
            }
            System.out.println(noOfWords);
        }
    }
}
