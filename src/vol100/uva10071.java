package vol100;

import java.util.Scanner;

class uva10071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t, v, s;

        while (scanner.hasNext()) {
            v = scanner.nextInt();
            t = scanner.nextInt();
            s = 2*v*t;
            System.out.print(s+"\n");
        }
    }
}
