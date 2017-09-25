package vol003;

import java.util.Scanner;

class uva344 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a[] = {"x","i","ii","iii","iv","v","vi","vii","viii","ix"};
        String c[] = {"i","v","x","l","c"};
        int r;
        while ((r = s.nextInt()) != 0) {
            int v, y, i = 0, count[];
            v = r;
            count = new int[5];
            String output = "";
            while (r >= 1) {
                String no = "";
                y = r;
                while (y > 0) {
                    if (y == 100) {
                        no += "c";
                        y -= 100;
                    } else if(y >= 90){
                        no += "xc";
                        y -= 90;
                    } else if(y >= 50){
                        no += "l";
                        y -= 50;
                    } else if(y >= 40){
                        no += "xl";
                        y -= 40;
                    } else {
                        int t = y / 10;
                        if (t >= 1) {
                            no += a[0];
                            y -= 10;
                        } else {
                            int h = y % 10;
                            no += a[h];
                            y -= h;
                        }
                    }
                }
                output += no;
                r--;
            }
            for (String d : c) {
                String s1 = output.replaceAll(d, "");
                count[i] = output.length() - s1.length();
                i++;
            }
            System.out.print(v+": "+count[0]+" i, "+count[1]+" v, "+count[2]+" x, "+count[3]+" l, "+count[4]+" c\n");
        }
    }
}
