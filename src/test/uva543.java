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
public class uva543 {
    public static void main(String[] args){
        System.out.println(primeNo(42));
    }
    public static String primeNo(int no){
        int range = (int) Math.sqrt(no) + 1;
        int p[], index = 0;
        p = new int[100];
        for (int i = 1; i <= no; i++) {
            for (int j = 2; j <= i*i; j++) {
                if (i%j != 0) {
                    p[++index] = i;
                }
            } 
        }
        int dMax = 0;
        int a = 0, b = 0;
        for (int pi : p) {
            for (int pj : p) {
                if (pi + pj == no && Math.abs(pi-pj) >= dMax) {
                    a = pi;
                    b = pj;
                    dMax = Math.abs(a - b);
                }
            }
        }
        return no+" = "+a+" + "+b;
    } 
}