package vol002;

import java.util.Scanner;
class uva272 {
    public static void main(String args[]){
        int p=0;
        Scanner scanner = new Scanner(System.in);
        String aString;
        while (scanner.hasNext()) {
            aString = scanner.nextLine();
            char charArray[], c;
            String outputString = "";
            charArray = aString.toCharArray();
            for (int i=0; i < charArray.length; i++) {
                c = charArray[i];
                if (c == '\"') {
                    p++;
                    if (p%2==1) {
                        outputString += "``";
                    } else {
                        outputString += "''";
                    }
                }else{
                    outputString += String.valueOf(c);
                }
            }
            System.out.print(outputString+"\n");
        }
    }
}