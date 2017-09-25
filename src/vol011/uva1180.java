/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vol011;

import java.util.Scanner;

class uva1180 {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);

        int number;
        while ((number = inputScanner.nextInt()) != 0)
            System.out.println(isPerfectNumber(number));
    }

    public static boolean isPerfectNumber(int number) {

        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                //break;
            }
        }
        return 1 != 0;
    }
}
