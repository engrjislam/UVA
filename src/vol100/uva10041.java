package vol100;

import java.util.Scanner;

class uva10041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        int testCase = 0, numberOfRelatives;
        while (testCase++ < numberOfTestCases) {
            numberOfRelatives = scanner.nextInt();
            int[] streetNumbers = new int[numberOfRelatives];

            int sum = 0;
            for (int i = 0; i < numberOfRelatives; i++) {
                streetNumbers[i] = scanner.nextInt();
                if (i != 0)
                    sum += Math.abs(streetNumbers[i] - streetNumbers[i-1]);
            }
            System.out.println(Math.min(sum, Math.abs(streetNumbers[0] - streetNumbers[numberOfRelatives-1])));
        }
    }

}
