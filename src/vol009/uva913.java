/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vol009;

import java.util.Scanner;

/**
 *
 * @author Tamanna
 */
public class uva913 {
    public static void main(String args[]){
        long s, lineStop, ans;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {            
            lineStop = scan.nextLong();
            s = 0;
            for (long i = 1; i <= lineStop; i += 2) {
                s += i;
            }
            ans = 6*s - 9;
            System.out.println(ans);
        }
        
    }
}
