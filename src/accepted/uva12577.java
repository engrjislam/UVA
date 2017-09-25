package accepted;

import java.util.Scanner;

class uva12577 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int caseNo = 0;
        String hajj;
        while (!"*".equals(hajj = s.next())) { 
            caseNo++;
            if ("Hajj".equals(hajj)) {
                System.out.printf("Case %d: Hajj-e-Akbar\n", caseNo);
            } else {
                System.out.printf("Case %d: Hajj-e-Asghar\n", caseNo);
            }
        }
    }
}
