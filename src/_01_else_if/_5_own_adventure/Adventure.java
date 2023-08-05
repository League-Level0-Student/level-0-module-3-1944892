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
	String B = JOptionPane.showInputDialog("We are going on a bear hunt do you want to go over around under or through the cave?");
	if(B.equals("over")) {
		JOptionPane.showMessageDialog(null, "A huge bird swooped over your head and ate you.");	
		System.exit(0);
	}
	if(B.equals("around")) {
		JOptionPane.showMessageDialog(null, "There was milk and you drank it. You got poisned to death.");	
		System.exit(0);
		
	}
	if(B.equals("under")) {
		JOptionPane.showMessageDialog(null, "A mole boxed with you and you got KOed.");	
		System.exit(0);
	}
	if(B.equals("through")) {
String C =	JOptionPane.showInputDialog("You enter the cave and there are four holes around you which do you choose to go through? Behind only 1 door there is treasure. 1-4");
if(C.equals("1")) {
	JOptionPane.showMessageDialog(null, "You fell through a hole to the center of the Earth.");	
	System.exit(0);
}
if(C.equals("2")) {
	JOptionPane.showMessageDialog(null, "The 2 walls next to you started moving and crushed you.");	
	System.exit(0);
	}
	}
	if(C.equals("3")) {
		JOptionPane.showMessageDialog(null, "The 2 walls next to you started moving and crushed you.");	
		System.exit(0);
		}
	
		}



	}
}
