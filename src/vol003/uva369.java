/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vol003;

/**
 *
 * @author Tamanna
 */
import java.math.BigInteger;
import java.util.Scanner;


public class uva369 {
    
    public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	BigInteger factn,factc;
			
	int i,j,n,r;
	while(input.hasNextInt()){
            factn = new BigInteger("1");
            factc = new BigInteger("1");

            n = input.nextInt();
            r = input.nextInt();

            if(n == 0 && r == 0)
                 break;

            if(n-r >= r){
                for(i = n-r+1; i <= n; i++)
                    factn = factn.multiply(BigInteger.valueOf(i));
                for(j  = 1; j <= r; j++)
                    factc = factc.multiply(BigInteger.valueOf(j));
                System.out.println(+n+" things taken "+r+" at a time is "+factn.divide(factc)+" exactly.");
            } else {
                for(i=r+1;i<=n;i++)
                    factn=factn.multiply( BigInteger.valueOf(i));
                for(j=1;j<=n-r;j++)
                    factc=factc.multiply(BigInteger.valueOf(j));
                System.out.println(+n+" things taken "+r+" at a time is "+factn.divide(factc)+" exactly.");
            }
        }
    }
}