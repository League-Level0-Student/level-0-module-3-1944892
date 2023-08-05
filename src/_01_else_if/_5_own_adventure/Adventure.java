package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		String A = JOptionPane.showInputDialog("Do you want to start your adventure? Enter yes to start, enter no to exit, enter help to get help.");
		if(A.equals("no")) {
			System.exit(0);
		}
		if(A.equals("help")) {
			JOptionPane.showMessageDialog(null, "Enter F to go forward, enter L to go left ,enter R to go right, and enter B to go backward.");
			System.exit(0);
		}
		
		
		
		
		if(A.equals("yes")) {
			JOptionPane.showInputDialog("We are going on a bear hunt do you want to go over around under or through?");

		}




	}
}
