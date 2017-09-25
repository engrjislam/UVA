/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author Tamanna
 */
public class Test {
    public static void main(String[] args){
        //primeNo(42);
        System.out.println("60000  ".length());
    }
    public static void primeNo(int no){
        int range = (int) Math.sqrt(no) + 1;
        int p[], index = 0;
        p = new int[100];
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i*i; j++) {
                if (i%j != 0) {
                    System.out.println(i);
                }
            } 
        }
    } 
}
