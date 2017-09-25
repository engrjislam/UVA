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
public class uva591 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int set = 0, n, h[];
        while ((n = scan.nextInt()) > 0) {
            h = new int[n];
            int avg, moveCount = 0, th = 0;
            for (int i = 0; i < n; i++) {
                h[i] = scan.nextInt();
                th += h[i];
            }
            avg = th / n;
            for (int hi : h) {
                if ( avg - hi >= 1) {
                    moveCount += (avg - hi);
                }
            }
            set++;
            System.out.println("Set #"+set+"\n" + "The minimum number of moves is "+moveCount+".");
        }
    }
}
