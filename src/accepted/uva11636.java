package accepted;

import java.util.Scanner;
class uva11636 {
	public static void main(String args[]){
		Scanner inputScanner=new Scanner(System.in);
		int index=1,m,n,count,p;
		while(inputScanner.hasNextInt()){
			n=inputScanner.nextInt();
			if(n<0)
				break;
			p=0;
			m=1;
			while(m<n){
				p++;
				m=2*m;
			}
			System.out.println("Case "+index+": "+p);
			index++;
		}
	}
}
