import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Nickels=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int Nickelcount=Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
String Dimes=JOptionPane.showInputDialog("How many dimes do you have?");
int Dimescount=Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
String Quarters=JOptionPane.showInputDialog("How many quaters do you have?");
int Quartercount=Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
double Money=(0.05*Nickelcount) + (0.1*Dimescount) + (0.25*Quartercount);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have " + Money + " dollars.");
	}
}
