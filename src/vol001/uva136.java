package vol001;

public class uva136 {
    public static void main(String args[]){
		int index = 0;
		long n,k=1;

		while(index < 1500){
			n = k;
			while(n != 1){
				if(n%2==0)
					n = n/2;
				else if(n%3==0)
					n = n/3;
				else if(n%5==0)
					n = n/5;
				else
					break;
			}
			if(n == 1){
				System.out.print(k+" ");
				index++;
			}
			k++;
		}

        System.out.println();
    }
}
