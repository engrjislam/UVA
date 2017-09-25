/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unsolved;

/**
 *
 * @author Tamanonoa
 */
public class uva443 {
    
    public static void main(String[] args){
        System.out.println(humbleNumber(5842));
    }
    
    public static String nth(int n){
        String suf = n+"th";
        if (n%10 == 1 && n != 11) {
            suf = n+"st";
        } else if (n%10 == 2 && n != 12) {
            suf = n+"nd";
        } else if (n%10 == 3 && n != 13) {
            suf = n+"rd";
        }
        return suf;
    }
    
    public static long humbleNumber(int n){
        int index = 0;
        long no, k = 1, p = 0;

        while(index != n){
            no = k;
            while(no != 1){
                if(no%2 == 0)
                    no = no/2;
                else if(no%3 == 0)
                    no /= 3;
                else if(no%5 == 0)
                    no /= 5;
                else if(no%7 == 0)
                    no /= 7;
                else
                    break;
            }
            if(no == 1){
                p = k;
                index++;
            }
            k++;
        }
        return p;
    }
}
