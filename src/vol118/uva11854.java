package vol118;

import java.util.Scanner;

class uva11854 {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);
        int a, b, c;
        float s;
        while (true) {
            a = inputScanner.nextInt();
            b = inputScanner.nextInt();
            c = inputScanner.nextInt();
            s = (a + b + c)/2;
            if (a == 0 && b == 0 && c == 0)
                break;
            if (a*a == b*b + c*c || b*b == c*c + a*a || c*c == a*a + b*b)
                System.out.print("right\n");
            else
                System.out.print("wrong\n");
        }
    }
}
