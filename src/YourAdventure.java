import javax.swing.JOptionPane;

public class YourAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Your task if you choose to accept it, is to find the golden breadbox. This magical breadbox is the ultimate breadbox that will never cause your bread to grow stale.");	
	int N=JOptionPane.showOptionDialog(null, "Do you accept this challenge?", "Your choice!", JOptionPane.YES_NO_OPTION,
	JOptionPane.INFORMATION_MESSAGE, null,
	new String[] { "Yes, I will find your golden breadbox.", "I'm sorry that is your problem." }, null);
	if (N==1) {
		JOptionPane.showMessageDialog(null, "You will die after eating a stale fortune cookie.");
	}
	if (N==0) {
		Breadbox1();
	}
}
public static void Breadbox1() {
	JOptionPane.showMessageDialog(null, " Thank you, your bravery will be rewarded!");	
	int N=JOptionPane.showOptionDialog(null, "Where is the golden breadbox hiding?", "Places", JOptionPane.YES_NO_OPTION,
	JOptionPane.INFORMATION_MESSAGE, null,
	new String[] { "Walmart", "Starbucks", "Samsung Store", "Mars" }, null);
	if (N==0) {
		JOptionPane.showMessageDialog(null, "You walked into a Walmart on Black Friday and died in the stampede.");
	}
	if (N==1) {
		JOptionPane.showMessageDialog(null, "You swallowed the ice in you low fat, skinny ice coffee, white chocolate mocha, latte, decaf, with extra cream."  );
	}
	if (N==2) {
		JOptionPane.showMessageDialog(null, "You became the security guard at the new Samsung Store, you are now a Guardian of the Galaxy. However you were fired. \n You now live under a bridge in a van, and later died of disease." );
	}
	if (N==3) {
		JOptionPane.showMessageDialog(null, "You have lauched a mission to Mars, the breadbox is close at hand");	
		int n=JOptionPane.showOptionDialog(null, "The Mars surface is littered with cool items!", "Mars", JOptionPane.YES_NO_OPTION,
		JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Bring a shovel and start to dig!", "Go explore the M&M's factory!" }, null);
		if (n==0) {
			JOptionPane.showMessageDialog(null, "You have found nothing but dirt, why would you think you would get the breadbox on your first try? \nThe surface area of Mars is huge, it could be buried any where!");
		}
		if (n==1) {
			JOptionPane.showMessageDialog(null, "Inside the factory a shiny box is at the center. It is indeed the golden breadbox. \nThank you for your service and for finiding my magic box!");
		}
	}
}
}

