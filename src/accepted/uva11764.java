package accepted;

import java.util.Scanner;

class uva11764 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int noOfTest, noOfWall, highJump, lowJump, caseNo;
        int wallHeight[];
        noOfTest = s.nextInt();
        caseNo = 0;
        while (noOfTest > 0) {            
            noOfWall = s.nextInt();
            wallHeight = new int[noOfWall];
            highJump = 0;
            lowJump = 0;
            int cp, np;
            for (int i = 0; i < noOfWall; i++) {
                wallHeight[i] = s.nextInt();
            }
            for (int i = 0; i < noOfWall - 1; i++) {
                cp = wallHeight[i];
                np = wallHeight[i+1];
                if (cp < np) {
                    highJump++;
                }
                if (cp > np) {
                    lowJump++;
                }
            }
            caseNo++;
            System.out.printf("Case %d: %d %d\n", caseNo, highJump, lowJump);
            noOfTest--;
        }
    }
}