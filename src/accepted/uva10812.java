package accepted;

import java.util.Scanner;

class uva10812 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int noOfTest, s, d, score1, score2, m, n;
        noOfTest = scanner.nextInt();
        while (noOfTest > 0) {
            s = scanner.nextInt();
            d = scanner.nextInt();
            if (s < d || !checkFormat(s, d)) {
                System.out.printf("impossible\n");
            } else {
                score1 = (s+d)/2;
                score2 = Math.abs(s-d)/2;
                System.out.printf("%d %d\n", score1, score2);
            }
            noOfTest--;
        }
    }
    public static boolean checkFormat(int s, int d){
	        return (s%2==0 && d%2==0)||(s%2==1 && d%2==1);
    }
}