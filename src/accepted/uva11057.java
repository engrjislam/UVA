package accepted;

import java.util.Scanner;

class uva11057 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int noOfBooks, money, b1, b2, min, diff, prices[];
        while (s.hasNext()) {
            noOfBooks = s.nextInt();
            b1 = -1;
            b2 = -1;
            prices = new int[noOfBooks];
            for (int i = 0; i < noOfBooks; i++) {
                prices[i] = s.nextInt();
            }
            money = s.nextInt();
            min = 1000000;
            for (int i = 0; i < noOfBooks - 1; i++) {
                for (int j = i+1; j < noOfBooks; j++) {
                    if (prices[i] + prices[j] == money) {
                        diff = Math.abs(prices[i] - prices[j]);
                        if (diff < min) {
                            if (prices[i] < prices[j]) {
                                b1 = prices[i];
                                b2 = prices[j];
                            }else {
                                b1 = prices[j];
                                b2 = prices[i];
                            }
                            min = diff;
                        }
                    }
                }
            }
            System.out.printf("Peter should buy books whose prices are %d and %d.\n\n", b1, b2);
        }
    }
}