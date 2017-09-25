package accepted;

import java.util.Scanner;
class uva10783 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int t,a,b,index,i,sum;
		while(input.hasNextInt()){
			t=input.nextInt();
			index=1;
			while(index<=t){
				a=input.nextInt();
				b=input.nextInt();
				sum=0;
				if(a%2==0)
					a=a+1;
				for(i=a;i<=b;i+=2)
					sum=sum+i;
				System.out.println("Case "+index+": "+sum);
				index++;
			}
		}
	}
}
