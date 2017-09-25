package accepted;

import java.util.Scanner;

class uva11332 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        while ((n = s.nextInt()) != 0) {            
            int x = f(n);
            while (x > 9) {                
                x = f(x);
            }
            System.out.printf("%d\n",x);
        }
    }
    public static int f(int n){
        int r, sum = 0;
        while (n >= 1) {            
            r = n % 10;
            n /= 10;
            sum += r;
        }
        return sum;
    }
}
