package vol005;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author Tamanna
 */
public class uva575 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String no, n;
        no = scan.next();
        n = no.trim();
        while(!n.equals("0")){
            System.out.println(calculateDecimalValue(n));
            no = scan.next();
            n = no.trim();
        }
    }
    
    public static boolean isSkewBinary(String s){
        if (s.charAt(0) == '2') {
            //check all other 
            int count1 = s.length() - s.replaceAll("1", "").length();
            int count2 = s.length() - s.replaceAll("2", "").length();
            int count1And2 = count1 + count2;
            if (count1And2 > 1) {
                return false;
            }
        }
        return true;
    }
    
    public static int calculateDecimalValue(String no){
        int decimalValue = 0;
        int digit = no.length();
        int d, pos = 0;
        while (digit > 0) {            
            d = (int) no.charAt(pos) - 48;
            decimalValue += d * (Math.pow(2, digit) - 1);
            pos++;
            digit--;
        }
        return decimalValue;
    }
}
