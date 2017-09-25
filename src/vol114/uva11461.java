package vol114;

import java.util.Scanner;

class uva11461 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        while ((a = scanner.nextInt()) != 0 && (b = scanner.nextInt()) != 0) {
            c = 0;
            for (int i = a; i <= b; i++)
                for (int j = 1; j * j <= i; j++)
                    if (j * j % i == 0)
                        c++;
            System.out.println(c);
        }
    }

}
