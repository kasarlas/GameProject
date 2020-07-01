package com.arvest.Game_Project;

import java.util.Scanner;

	public class RockPaperScissors  {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String validInputMsg = "Valid Input: R, P, S or E (R = Rock.  P = Paper. S = Scissors. E = Exit Game) ";
			String aInput;
			String bInput;
			System.out.println("Play Rock Paper Scissors:");

			while (true) {
				System.out.print("Play again. ");
				System.out.println(validInputMsg);
				System.out.print("Enter A input: ");
				aInput = s.nextLine();

				if (isValidInput(aInput)) {
					if (aInput.equalsIgnoreCase("E")) {
						break;
					}
					System.out.print("Enter B input: ");
					bInput = s.nextLine();

					if (isValidInput(bInput)) {
						if (bInput.equalsIgnoreCase("E")) {
							break;
						}
						System.out.println(processInput(aInput, bInput));
					} else {
						System.out.println("Invalid input for B");
						System.out.print(validInputMsg);
					}
				} else {
					System.out.println("Invalid input for A");
				}
			}
		}

		public static String processInput(String aInput, String bInput) {
			if (aInput.equalsIgnoreCase("R")) {
				if (bInput.equalsIgnoreCase("R")) {
					return "Draw";
				} else if (bInput.equalsIgnoreCase("P")) {
					return "Winner is B";
				} else if (bInput.equalsIgnoreCase("S")) {
					return "Winner is A";
				}
			} else if (aInput.equalsIgnoreCase("P")) {
				if (bInput.equalsIgnoreCase("R")) {
					return "Winner is A";
				} else if (bInput.equalsIgnoreCase("P")) {
					return "Draw";
				} else if (bInput.equalsIgnoreCase("S")) {
					return "Winner is B";
				}
			} else if (aInput.equalsIgnoreCase("S")) {
				if (bInput.equalsIgnoreCase("R")) {
					return "Winner is B";
				} else if (bInput.equalsIgnoreCase("P")) {
					return "Winner is A";
				} else if (bInput.equalsIgnoreCase("S")) {
					return "Draw";
				}
			}
			return null;
		}

		public static boolean isValidInput(String aInput) {
			if (aInput != null && (aInput.equalsIgnoreCase("R") || aInput.equalsIgnoreCase("P")
					|| aInput.equalsIgnoreCase("S") || aInput.equalsIgnoreCase("E"))) {
				return true;
			}
			return false;
		}

	}

