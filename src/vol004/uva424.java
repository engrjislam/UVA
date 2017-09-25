package vol004;

import java.math.BigInteger;
import java.util.Scanner;

class uva424 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String x;
        BigInteger sum = new BigInteger("0");
        while (!"0".equals(x = s.next())) {
            BigInteger no = new BigInteger(""+x);
            sum = sum.add(no);
        }
        System.out.println(sum);
    }
}