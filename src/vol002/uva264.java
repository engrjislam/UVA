package vol002;

import java.util.Scanner;

class uva264 {
    public static void  main(String args[]){
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int index = 0, a = 0, b = 0, n = s.nextInt();
            for (int i = 1 ; ; i++) {
                int x = i;
                for (int j = 1; j<= i; j++) {
                    int y = j;
                    if (i%2==1) {
						a = x;
						b = y;
                    } else {
						a = y;
						b = x;
                    }
                    x--;
                    index++;
                    if (index == n) {
                        break;
                    }
                }
                if (index == n) {
                    break;
                }
            }
            System.out.print("TERM "+index+" IS "+a+"/"+b+"\n");
        }
    }
}