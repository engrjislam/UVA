package accepted;

import java.util.Scanner;

class uva12543 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str, msg = "", subString;
        char ch[];
        int maxLen = -1;
        while (!"E-N-D".equals(str = s.next())) {
            subString = "";
            ch = str.toCharArray();
            for (char c : ch) {
                if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')||c=='-') {
                    subString += ""+c;
                }
            }
            if (subString.length() > maxLen) {
                msg = subString;
                maxLen = str.length();
            }
        }
        System.out.println(msg.toLowerCase());
    }
}
