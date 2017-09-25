package vol004;

import java.math.BigInteger;
import java.util.Scanner;

class uva495 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a, b, c;
        int n, l;

        while (true) {
            n = scanner.nextInt();
            a = new BigInteger(""+0);
            b = new BigInteger(""+1);
            c = new BigInteger(""+0);
            l = 2;
            while (l <= n) {
                c = a.add(b);
                a = b;
                b = c;
                l++;
            }
            if (n == 1)
                System.out.println("The Fibonacci number for " + n + " is 1");
            else
                System.out.println("The Fibonacci number for " + n + " is " + c);
        }
    }

}
