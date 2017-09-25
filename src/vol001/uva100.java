package vol001;

import java.util.Scanner;

class uva100 {

    public static void main(String[] args) {
        long i, j, oi, oj;
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            long temp, maxCycleLength;
            i = scanner.nextLong();
            j = scanner.nextLong();

            oi = i;
            oj = j;

            if(i > j){
				temp = i;
				i = j;
				j = temp;
			}

			maxCycleLength = numberOfCycle(i);

            for (long n = i+1; n <= j; n++) {
                if (maxCycleLength < numberOfCycle(n)) {
                    maxCycleLength = numberOfCycle(n);
                }
            }
            System.out.print(oi+" "+oj+" "+maxCycleLength+"\n");
		}
    }

    public static int numberOfCycle(long n){
        int cycleLength = 1;
            while (n != 1) {
                if (n % 2 == 1) {
                    n = 3*n + 1;
                } else {
                    n /= 2;
                }
                cycleLength++;
            }
        return cycleLength;
    }
}