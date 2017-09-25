package vol003;

import java.math.BigInteger;
import java.util.Scanner;

class uva374 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b, p, m;
        BigInteger r;
        while (scanner.hasNext()) {
            b = scanner.nextInt();
            p = scanner.nextInt();
            m = scanner.nextInt();
            r = bigPower(b, p).mod(BigInteger.valueOf(m));
            System.out.println(r);
            scanner.nextLine();
        }
    }

    public static BigInteger bigPower(int base, int power) {
        BigInteger bigPowerValue = BigInteger.ONE;
        for (int i = 0; i < power; i++) {
            bigPowerValue = bigPowerValue.multiply(BigInteger.valueOf(base));
        }
        return bigPowerValue;
    }

}
