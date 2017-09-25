/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vol005;

import java.util.Scanner;

/**
 *
 * @author Tamanna
 */
public class uva541 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, row, col, rowSum[], colSum[], matrix[][];
        while ((n = s.nextInt()) != 0) {
            matrix = new int[n][n];
            rowSum = new int[n];
            colSum = new int[n];
            row = 0;
            col = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += matrix[i][j];
                }
                rowSum[i] = sum;
                
                sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += matrix[j][i];
                }
                colSum[i] = sum;
            }
            
            int x = 0, y = 0;
            for (int i = 0; i < n; i++) {
                if (rowSum[i] % 2 == 1) {
                    row++;
                    x = i+1;
                }
                if (colSum[i] % 2 == 1) {
                    col++;
                    y = i+1;
                }
            }
            if (row == 0 && col == 0) {
                System.out.println("OK");
            } else if (row == 1 && col == 1) {
                System.out.printf("Change bit (%d,%d)\n",x,y);
            } else {
                System.out.println("Corrupt");
            }
        }
    }
}
