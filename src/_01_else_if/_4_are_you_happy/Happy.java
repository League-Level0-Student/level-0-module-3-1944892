package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {
		String hap = JOptionPane.showInputDialog("Are you happy?");
		if(hap.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing.");
		}
		if(hap.equals("no")) {
			hap = JOptionPane.showInputDialog("Do you want to be happy?");
			if(hap.equals("no")) { 
				JOptionPane.showMessageDialog(null, "Keep doing what your doing.");	
			}

			if(hap.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");

			}


		}

	}
}

