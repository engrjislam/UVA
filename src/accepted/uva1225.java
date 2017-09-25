package accepted;

import java.util.Scanner;

class uva1225 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int testNO, limit;
        String noString;
        testNO = s.nextInt();
        while (testNO > 0) {            
            limit = s.nextInt();
            noString = "";
            int x;
            for (int i = 1; i <= limit; i++) {
                noString += ""+i;
            }
            for (int i = 0; i < 10; i++) {
                String regEx = ""+i;
                String replace = "";
                x = noString.length() -  noString.replaceAll(regEx,replace).length();
                if (i == 9) {
                    System.out.printf("%d\n",x); 
                } else {
                    System.out.printf("%d ",x);
                }
            }
            testNO--;
        }
    }
}