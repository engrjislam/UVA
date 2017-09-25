package vol103;

import java.util.Scanner;

class uva10302 {
   public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int x;
       long sum;
       while (s.hasNext()) {           
           x = s.nextInt();
           sum = 0;
           for (int i = 1; i <= x; i++) {
               sum += (long) Math.pow(i, 3);
           }
           System.out.printf("%d\n",sum);
       }
   }
}