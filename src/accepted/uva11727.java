package accepted;

import java.util.Scanner;

class uva11727 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i, c = 1, x, n, a[];
        a = new int[3];
        n = s.nextInt();
        x = n;
        while (x >= 1) {
            i = 0;
            while (i < 3) {
                a[i] = s.nextInt();
                i++;
            }
            for (int j = 0; j < 2; j++) {
                for (int k = j+1; k < 3; k++) {
                    int temp;
                    if (a[j] > a[k]) {
                        temp = a[j];
                        a[j] = a[k];
                        a[k] = temp;
                    }
                }
            }
            System.out.printf("Case %d: %d\n", c, a[1]);
            c++;
            x--;
        }
    }
}