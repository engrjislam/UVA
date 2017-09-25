package accepted;

import java.util.Scanner;

class uva12468 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a, b, x, result;
        while ((a = s.nextInt()) != -1 && (b = s.nextInt()) != -1) {      
            if (a > b) {
                int temp;
                temp = a;
                a = b;
                b = temp;
            }
            x = Math.abs(a - b) % 100;
            result = Math.min(x, 100 - x);
            System.out.println(result);
        }
    }
}