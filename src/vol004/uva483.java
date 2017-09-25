package vol004;

import java.util.Scanner;

class uva483 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String reverseString = "", temporaryReverseString;
            String[] strings = input.trim().split(" ");
            for (String s: strings) {
                temporaryReverseString = "";
                for (char c : s.toCharArray())
                    temporaryReverseString = c + temporaryReverseString;
                reverseString += " " + temporaryReverseString;
            }
            System.out.println(reverseString.trim());
        }
    }

}
