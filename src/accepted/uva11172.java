package accepted;

import java.util.Scanner;

class uva11172 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int x, n, a, b;
        
        n = s.nextInt();
        x = n;
        while (x >= 1) {            
            a = s.nextInt();
            b = s.nextInt();
            if (a < b) {
                System.out.print("<\n");
            } else if (a > b) {
                System.out.print(">\n");
            } else {
                System.out.print("=\n");
            }
            x--;
        }       
    }
}