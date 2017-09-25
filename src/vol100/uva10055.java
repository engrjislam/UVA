package vol100;

import java.util.Scanner;
class uva10055{
	public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int a, b;
	        while(s.hasNext()){
                        a = s.nextInt();
	        	b = s.nextInt();
	        	System.out.println(Math.abs(a-b));
	        }
    }
}