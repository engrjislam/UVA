/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vol103;

import java.util.Scanner;

/**
 *
 * @author Tamanna
 */
public class uva10300 {
    public static void main(String[] args){
        int testCase, noOfFarmer, farmyard, numberOfAnimals, environmentFriendliness, premium = 0;
        long finalPremium;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            testCase = scan.nextInt();
            while (testCase > 0) {
                noOfFarmer = scan.nextInt();
                finalPremium = 0;
                while (noOfFarmer > 0) {
                    farmyard = scan.nextInt();
                    numberOfAnimals = scan.nextInt();
                    environmentFriendliness = scan.nextInt();
                    premium = farmyard * environmentFriendliness;
                    finalPremium += premium;
                    noOfFarmer--;
                }
                System.out.println(finalPremium);
                testCase--;
            }
        }
    }
}
