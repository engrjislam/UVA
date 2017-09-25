package vol100;

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
public class uva10038 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n, a[], b[], i, abs;
        String status;
        
        while (scan.hasNext()) {
            status = "yes";
            n = scan.nextInt();
            a = new int [n];
            b = new int [n - 1];
            
            i = 0;
            while (i < n) {            
                a[i] = scan.nextInt();
                i++;
            }

            i = 0;
            while (i < n - 1) {            
                abs = Math.abs(a[i] - a[i+1]);
                if((abs > 0 && abs < n)){
                    b[abs-1]++;
                } else {
                    status = "not";
                    break;
                }
                i++;
            }

            for (int j : b) {
                if (j == 0) {
                    status = "not";
                    break;
                }
            }

            if (status.equals("yes")) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
    }
}
