package accepted;

import java.util.Scanner;

class uva11936 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a, b, c, noOfTest;
        double s, area;
        noOfTest = scanner.nextInt();
        while (noOfTest > 0) {            
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            s = (double)(a + b + c) / 2.0;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            if (area > 0.0) {
                System.out.printf("OK\n");
            } else {
                System.out.printf("Wrong!!\n");
            }
            noOfTest--;
        }
    }
}