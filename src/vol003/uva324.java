package vol003;

import java.math.BigInteger;
import java.util.Scanner;

class uva324 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        while (true) {
            n = s.nextInt();
            if (n == 0) {
                break;
            } else {
                String fact = factorial(n);
                System.out.print(n+"! --\n");
                digits(fact);
            }
        }
    }

    public static String factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }

    public static void digits(String s){
        String splitedNo,digit[] = {"0","1","2","3","4","5","6","7","8","9"};
        int i,digitConunter[] = new int[10];
        for (String d : digit) {
            splitedNo = s.replaceAll(d, "");
            i = Integer.parseInt(d);
            digitConunter[i] = s.length() - splitedNo.length();
        }
        System.out.printf("   (0)%5d    (1)%5d    (2)%5d    (3)%5d    (4)%5d\n", digitConunter[0], digitConunter[1], digitConunter[2], digitConunter[3], digitConunter[4]);
        System.out.printf("   (5)%5d    (6)%5d    (7)%5d    (8)%5d    (9)%5d\n", digitConunter[5], digitConunter[6], digitConunter[7], digitConunter[8], digitConunter[9]);
    }
}