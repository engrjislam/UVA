package vol002;

import java.util.Scanner;

public class uva299 {
    public static void main(String args[]){
        int n, temp, samp, in = 0;
        int a[];
        Scanner aScanner = new Scanner(System.in);
        samp = aScanner.nextInt();
        while (in != samp) {    
            int swapsUp = 0;
            n = aScanner.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = aScanner.nextInt();
            }

            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    if (a[i]>a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        swapsUp++;
                    }
                }
            }
            System.out.printf("Optimal train swapping takes %d swaps.\n", swapsUp);
            in++;
        }
        
    }
}