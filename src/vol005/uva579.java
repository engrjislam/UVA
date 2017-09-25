package vol005;

import java.util.Scanner;

class uva579 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int h, m;
        float a;

        while (!(input = scanner.nextLine().trim()).equals("0:00")) {
            h = Integer.parseInt(input.split(":")[0]);
            m = Integer.parseInt(input.split(":")[1]);

            if (60*h - 11*m >= 0)
                a = (60*h - 11*m)/2.0f;
            else
                a = (11*m - 60*h)/2.0f;

            if (a > 180.0f)
                a = 360 - a;

            System.out.printf("%.3f\n", a);
        }
    }

}
