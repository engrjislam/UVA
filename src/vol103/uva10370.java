/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vol103;

import java.util.Scanner;

/**
 *
 * @author Tamanna
 */
public class uva10370 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int testCase, caseNo, sum = 0, n, a[];
        double avg, avgUp;
        testCase = scan.nextInt();
        while (testCase > 0) { 
            int avgUpNo = 0, index = 0;
            caseNo = scan.nextInt();
            a = new int[caseNo];
            while (caseNo > 0) { 
                n = scan.nextInt();
                a[index++] = n;
                sum += n;
                caseNo--;
            }
            avg = sum / index;
            for (int i : a) {
                if (i > avg) {
                    avgUpNo++;
                }
            }
            avgUp = avgUpNo * 100.0 / index;
            System.out.printf("%5.3f",avgUp);
            System.out.println("%");
            sum = 0;
            testCase--;
        }
    }
}
