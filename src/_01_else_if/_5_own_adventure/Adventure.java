package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		String A = JOptionPane.showInputDialog("Do you want to start your adventure? Enter yes to start :), enter no to exit :(, enter help to get help .");
		if(A.equals("no")) {
			System.exit(0);
		}
		if(A.equals("help")) {
			JOptionPane.showMessageDialog(null, "Enter each anime characters name (first letter capital) why you ask?");
			System.exit(0);
		}
		if(A.equals("yes")) {
			String B = JOptionPane.showInputDialog("Okay who do you want to be Goku, Tanjiro, Naruto, or Luffy?");
			if(B.equals("Tanjiro")) {
				JOptionPane.showInputDialog(null, "Your quest is to be the top ranked demon slayer a hashira. Enter 1");	
				System.exit(0);
			}
			if(B.equals("Goku")) {
				JOptionPane.showInputDialog(null, "Your quest is to find the 7 balls of the dragon and ask a wish to the great dragon. Enter 2");	
				System.exit(0);

			}
			if(B.equals("Naruto")) {
				JOptionPane.showInputDialog(null, "Your quest is to become the most respected in your village the hokage. Enter 3");	
				System.exit(0);
			}
			if(B.equals("Luffy")) {
				String C =	JOptionPane.showInputDialog("Your quest is to become the king of pirates and find the One Piece. Enter 4");
				if(C.equals("1")) {
					System.exit(0);

					if(B.equals("1")) {
						String D =	JOptionPane.showInputDialog("After killing muzan but becoming a demon your are now the king of demons.");
					}
					System.exit(0);

					if(B.equals("2")) {
						String D =	JOptionPane.showInputDialog("You found the 7 balls and requested that everyone killed to come back.");
					}
					System.exit(0);

					if(B.equals("3")) {
						String D =	JOptionPane.showInputDialog("20 years later you are the hokage of the hidden leaf.");
					}
					System.exit(0);

					if(B.equals("4")) {
						String D =	JOptionPane.showInputDialog("You made the world's strongest crew and became the king of pirates.");
					}
					System.exit(0);
					// Hope you enjoy :)
				}

			}

		}


	}
}
