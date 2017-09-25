package vol118;

import java.util.Scanner;

class uva11805 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k, p, c, cn = 0;
        c = scanner.nextInt();
        while (c >= 1) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            p = scanner.nextInt();
            if (p % n + k > n)
                System.out.println("Case "+ ++cn +": " + (p % n + k) % n);
            else
                System.out.println("Case "+ ++cn +": " + (p % n + k));
            c--;
        }
    }

}
