package accepted;

import java.util.Scanner;

class uva12578 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int noOfTest, length;
        double greenArea, redArea;
        noOfTest = s.nextInt();
        while (noOfTest > 0) {
            length = s.nextInt();
            redArea = (double) (0.04*Math.PI)*(length*length);
            greenArea = (double) (0.6 - 0.04*Math.PI)*(length*length);
            System.out.printf("%.2f %.2f\n", redArea, greenArea);
            noOfTest--;
        }
    }
}