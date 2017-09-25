package vol100;

import java.math.BigInteger;
import java.util.Scanner;

class uva10070 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger year;

        while (scanner.hasNext()){
            year = scanner.nextBigInteger();
            if (isLeapYear(year))
                System.out.println("This is leap year.");
            if (isHuluculu(year))
                System.out.println("This is huluculu festival year.");
            if (isBulukulu(year))
                System.out.println("This is bulukulu festival year.");
            if (!isLeapYear(year) && !isHuluculu(year) && !isBulukulu(year))
                System.out.println("This is an ordinary year.");
            System.out.println();
        }
    }

    public static boolean isLeapYear(BigInteger year) {
        if (year.mod(BigInteger.valueOf(4)) == BigInteger.ZERO && year.mod(BigInteger.valueOf(100)) != BigInteger.ZERO || year.mod(BigInteger.valueOf(400)) == BigInteger.ZERO)
            return true;
        return false;
    }

    public static boolean isHuluculu(BigInteger year) {
        if (year.mod(BigInteger.valueOf(15)) == BigInteger.ZERO)
            return true;
        return false;
    }

    public static boolean isBulukulu(BigInteger year) {
        if (year.mod(BigInteger.valueOf(55)) == BigInteger.ZERO && isLeapYear(year))
            return true;
        return false;
    }

}
