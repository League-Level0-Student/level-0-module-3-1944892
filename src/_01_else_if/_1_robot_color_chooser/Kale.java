package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

public class Kale {
	public static void main(String[] args) {
		String A =JOptionPane.showInputDialog("Hi do you want to start your journey of becoming a hashira? Enter yes to get started.");
		if(A.equals("yes")) {
			String B =JOptionPane.showInputDialog("Okay first you need to craft a sword. So go to the swordsmith and get a sword. To talk to the swordsmith enter E.");
			if(B.equals("E")) {
				String C =JOptionPane.showInputDialog("To get a sword get ore and wood and come back. Enter E to continue");
				if(C.equals("E")) {
					String D =JOptionPane.showInputDialog("Hed to the mountains and mine ores and trees.Press E to continue.");
					if(D.equals("E")) {
						String E =JOptionPane.showInputDialog("Good you found wood and ores hed back to the swordsmith. (It is always gonna be E)");
						if(E.equals("E")) {
							String F =JOptionPane.showInputDialog("Here is your sword your breathing is flame. ");
							if(F.equals("E")) {
								String G =JOptionPane.showInputDialog("Your first quest is to kill a lower rank demon.");
								if(G.equals("E")) {
									String I =JOptionPane.showInputDialog("You hed to the forest and spot lower 6. You kill it with the help of Giyu");
									if(I.equals("E")) {
										String J =JOptionPane.showInputDialog("At the entertainment district you find upper 6 and 7 it was bloody but you killed them with Tengen");
										if(J.equals("E")) {
											String K =JOptionPane.showInputDialog("Tengen retires and you finally reach the goal of becoming a hashira.");
											System.exit(0);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//😑
	}
}
