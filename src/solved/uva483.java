/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solved;

import java.util.Scanner;

/**
 *
 * @author Tamanna
 */
public class uva483 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String si, so, sa[];
        while (scan.hasNext()) {
            si = scan.nextLine();
            sa = si.split(" ");
            so = "";
            for (String string : sa) {
                so += strRev(string)+" ";
            }
            System.out.println(so.trim());
        }
    }
    public static String strRev(String s){
        char ch[];
        String rev = "";
        ch = s.toCharArray();
        for (char c : ch) {
            rev = "" + c + rev;
        }
        return rev;
    }
}
