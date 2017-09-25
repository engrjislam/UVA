package vol003;

import java.util.Scanner;

class uva382 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n, sum, set = 0;
        while(true){
            n = s.nextInt();
            if( set == 0){
                System.out.println("PERFECTION OUTPUT");
            }
            if( n == 0){
                System.out.println("END OF OUTPUT");
                break;
            }
            sum = 0;
            for(int i = 1; i <= n/2; i++){
                if( n%i == 0){
                    sum += i;
                }  
            }
            System.out.printf("%5d ", n);
            if( sum < n){
                System.out.println("DEFICIENT");
            }else if(sum == n){
                System.out.println("PERFECT");    
            }else{
                System.out.println("ABUNDANT");
            }
            set=1;
        }
    }
}