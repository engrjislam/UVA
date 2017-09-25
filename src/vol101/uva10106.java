/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vol101;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Tamanna
 */
public class uva10106 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	BigInteger x, y, m;
        while (input.hasNext()) {
            x = input.nextBigInteger();
            y = input.nextBigInteger();
            m = x.multiply(y);
            System.out.println(m);
        }
    }
}
