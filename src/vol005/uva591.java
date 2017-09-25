package vol005;

import java.util.Scanner;

class uva591 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfSet, sum, avg, noOfMoves, set = 0;
        int[] setOfBreaks;
        while ((noOfSet = scanner.nextInt()) != 0) {
            setOfBreaks = new int[noOfSet];
            sum = 0;
            for (int i = 0; i < noOfSet; i++) {
                setOfBreaks[i] = scanner.nextInt();
                sum += setOfBreaks[i];
            }

            avg = sum / noOfSet;
            noOfMoves = 0;
            for (int breaks : setOfBreaks) {
                if (breaks < avg)
                    noOfMoves += avg - breaks;
            }

            System.out.println("Set #" + ++set);
            System.out.println("The minimum number of moves is " + noOfMoves + ".");
            System.out.println();
        }
    }

}
