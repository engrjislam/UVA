package vol004;

import java.util.Scanner;

class uva488 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases, temporaryNoOfTestCases, amplitude, frequency, temporaryFrequency;

        String output;

        noOfTestCases = scanner.nextInt();
        temporaryNoOfTestCases = noOfTestCases;
        scanner.nextLine();

        while (temporaryNoOfTestCases >= 1) {
            amplitude = scanner.nextInt();
            frequency = scanner.nextInt();
            temporaryFrequency = frequency;

            if (frequency > 0) {
                output = "";

                if (amplitude > 0) {
                    for (int i = 1; i <= amplitude; i++) {
                        for (int j = 1; j <= i; j++) {
                            output += i;
                        }
                        output += "\n";
                    }
                    for (int i = amplitude - 1; i >= 1; i--) {
                        for (int j = i; j >= 1; j--) {
                            output += i;
                        }
                        output += "\n";
                    }
                }

                while (temporaryFrequency >= 1) {
                    System.out.print(output);
                    if (temporaryFrequency > 1)
                        System.out.println();
                    temporaryFrequency--;
                }

                if (temporaryNoOfTestCases > 1)
                    System.out.println();
            }

            temporaryNoOfTestCases--;
        }
    }

}
