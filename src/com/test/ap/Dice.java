package com.test.ap;

import java.util.Scanner;


/**Refid 89132c516713133a
 * 
 * @author hsonti
 *
 */
public class Dice {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		try {
			int firstFirst = scan.nextInt();
			int secondFirst = scan.nextInt();
			int firstSecond = scan.nextInt();
			int secondSecond = scan.nextInt();
			int thirdFirst = scan.nextInt();
			int fourthFirst = scan.nextInt();
			int thirdSecond = scan.nextInt();
			int fourthSecond = scan.nextInt();
		
			int[] firstDice = new int[secondFirst - firstFirst + 1];
			int[] secondDice = new int[secondSecond - firstSecond + 1];
		
			int[] thirdDice = new int[fourthFirst - thirdFirst + 1];
			int[] fourthDice = new int[fourthSecond - thirdSecond + 1];
		
			for (int i = 0; i < firstDice.length; i++) {
				firstDice[i] = firstFirst + i;
			}
			
			for (int i = 0; i < secondDice.length; i++) {
				secondDice[i] = firstSecond + i;
			}
			for (int i = 0; i < thirdDice.length; i++) {
				thirdDice[i] = thirdFirst + i;
			}
			for (int i = 0; i < fourthDice.length; i++) {
				fourthDice[i] = thirdSecond + i;
			}
		
			int emmaTurn = 0;
			int gunnarTurn = 0;
		
			for (int i = 0; i < firstDice.length; i++) {
				for (int j = 0; j < secondDice.length; j++) {
					for (int k = 0; k < thirdDice.length; k++) {
						for (int l = 0; l < fourthDice.length; l++){
						if (firstDice[i] + secondDice[j] > thirdDice[k] + fourthDice[l])
							gunnarTurn++;
						if (firstDice[i] + secondDice[j] < thirdDice[k] + fourthDice[l])
							emmaTurn++;
						}
					}
				}
			}
		
			if (emmaTurn > gunnarTurn) {
				System.out.println("EMMA");
				}
			else if (gunnarTurn > emmaTurn) {
				System.out.println("GUNNAr");
				}
			else {
				System.out.println("TIE");
				}
			} catch (Exception ex) {
				throw new Exception("Enter only numbers");
			}
		finally {
			scan.close();
		}
	}

}