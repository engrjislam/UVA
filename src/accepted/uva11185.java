package accepted;

import java.util.Scanner;

class uva11185 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n, r;
        String no;
        while ((n = s.nextInt()) >= 0) {
            no = "";
            do {
                r = n % 3;
                n /= 3;
                no = r+""+no;
            } while ( n > 0) ;
            System.out.printf("%s\n", no);
        }
    }
}
