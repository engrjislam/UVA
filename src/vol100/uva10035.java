package vol100;

import java.util.Scanner;

class uva10035 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int r1, r2, n1, n2;
        while (true) {     
            n1 = s.nextInt(); 
            n2 = s.nextInt();
            if (n1 == 0 && n2 == 0) {
                break;
            }
            int x1 = n1, x2 = n2;
            int x = 0,carry = 0;
            while (x1 > 0 || x2 > 0) {                
                r1 = x1 % 10;
                r2 = x2 % 10;
                if (x+r1+r2 > 9) {
                    carry++;
                }
                x1 /= 10;
                x2 /= 10;
                x = (x + r1 + r2) / 10;
            }
            if (carry == 0) {
                System.out.printf("No carry operation.\n");
            } else if (carry == 1) {
                System.out.printf("%d carry operation.\n", carry);
            } else {
                System.out.printf("%d carry operations.\n", carry);
            }
        }
    }
}
