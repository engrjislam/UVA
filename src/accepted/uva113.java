package accepted;

import java.util.Scanner;

class uva113 {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);
        double n, p, power;
        while (inputScanner.hasNextBigInteger()) {
            n = inputScanner.nextDouble();
            p = inputScanner.nextDouble();
            n = 1 / n;
            power = Math.pow(p, n);
            System.out.printf("%.0f\n", power);
        }
    }
}
