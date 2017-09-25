package vol100;

import java.util.Scanner;

class uva10079 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        long noOfPieces;
        int n;
        while ((n = s.nextInt()) >= 0) {   
            noOfPieces = 1;
            for (int i = 0; i <= n; i++) {
                noOfPieces += i;
            }
            System.out.printf("%d\n",noOfPieces);
        }
    }
}