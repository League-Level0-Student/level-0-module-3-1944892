package _01_else_if._2_crazy_cat_lady;

import javax.swing.JOptionPane;

public class Kale2 {
	public static void main(String[] args) {
		String A =JOptionPane.showInputDialog("My name is ace do you want to got ot sea one day ? (Always press E)");
		if(A.equals("E")) {
			String B =JOptionPane.showInputDialog("Okay first you need a devil fruit how about this one rubber fruit. By the way your name is Luffy right?");
			if(B.equals("E")) {
				String C =JOptionPane.showInputDialog("Nom Nom Nom");
				if(C.equals("E")) {
					String D =JOptionPane.showInputDialog("Now get a crew.");
					if(D.equals("E")) {
						String E =JOptionPane.showInputDialog("Your crew is zoro,nami,franky,sanji,robin,brook,chopper,and ussopp.");
						if(E.equals("E")) {
							String F =JOptionPane.showInputDialog("Now make a boat head to the Grand line");
							if(F.equals("E")) {
								String G =JOptionPane.showInputDialog("You go to the grand line and have many adventures.");
								if(G.equals("E")) {
									String I =JOptionPane.showInputDialog("In the end you find the one piece");
									if(I.equals("E")) {
										String J =JOptionPane.showInputDialog("And become the king of pirates.");
										if(J.equals("E")) {
											String K =JOptionPane.showInputDialog("Hope you anjoyed.:)");
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
	}
}


















