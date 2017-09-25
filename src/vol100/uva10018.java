package vol100;

import java.util.Scanner;

class uva10018 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        long a, b, sum;
        int ch, iteration;
        ch = s.nextInt();
        while (ch > 0) { 
            a = s.nextInt();
            b = reverseNo(a);
            sum = a + b;
            iteration = 1;
            while (!checkPalindrome(sum)) {                
                a = sum;
                b = reverseNo(a);
                sum = a + b;
                iteration++;
            }
            System.out.printf("%d %d\n", iteration, sum);
            ch--;
        }
    }
    public static boolean checkPalindrome(long sum){
        String s1, s2;
        s1 = ""+sum;
        s2 = ""+reverseNo(sum);
        return s1.equals(s2);
    }
    public static long reverseNo(long no){
        char c[];
        String noString = ""+no;
        c = noString.toCharArray();
        String rev = "";
        for (char d : c) {
            rev = d+""+rev;
        }
        return Long.parseLong(rev);
    }
}
