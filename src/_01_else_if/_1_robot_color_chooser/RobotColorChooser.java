
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.setSpeed(50);
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		while(true) {
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		//3. Set the pen width to 10
		rob.setPenWidth(50); 
		//4. Ask the user what color pen they would like the robot to draw with
	String color =	JOptionPane.showInputDialog("Enter a color to draw with!");
		//5. Use an if/else statement to set the pen color that the user requested
		
	if (color.equals("red")) {
			rob.setPenColor(252, 0, 0);
		}
	if(color.equals("yellow")){
		rob.setPenColor(248, 252, 0);
		}
	if(color.equals("blue")){
		rob.setPenColor(0, 252, 231);
		}
        //6. If the user doesn't enter anything, choose a random color
	
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		}
		



	}

	private static Object Random() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void fill(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}
}
