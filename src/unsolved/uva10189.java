/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unsolved;

/**
 *
 * @author Tamanna
 */
public class uva10189 {
    public static void main(String[] args){
        //System.out.println((int)('1'));
        int a[][];
        
        a = new int[10][10];
        
        for (int[] is : a) {
            for (int i : is) {
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}
