package vol005;

import java.math.BigInteger;
import java.util.Scanner;

class uva568 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        while (scanner.hasNext()) {
            number = scanner.nextInt();
            System.out.printf("%5d -> %s\n", number, "" + computeNonZeroDigitFactorial(factorial(number)));
        }

    }

    public static BigInteger factorial(int number) {
        if (number <= 1)
            return BigInteger.ONE;
        return BigInteger.valueOf(number).multiply(factorial(number - 1));
    }

    public static String computeNonZeroDigitFactorial(BigInteger bigInteger) {
        String nonZeroFactorial = bigInteger.toString();
        String lastNonZeroDigit = "";
        for (int i = nonZeroFactorial.length() - 1; i >= 0; i--) {
            if (nonZeroFactorial.charAt(i) != '0') {
                lastNonZeroDigit = String.valueOf(nonZeroFactorial.charAt(i));
                break;
            }
        }
        return lastNonZeroDigit;
    }

}
