import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String Pettype = JOptionPane.showInputDialog("Want kind of pet would like to buy?").toLowerCase();
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null,
				"What activities would you like to preform to make your pet happy?", "Pet happiness", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Take it for a walk", "Give it food", "Let it sleep" }, null);

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void WalkPet(String Pettype) {
		if (Pettype.equals("dog")) {
			happinessLevel += 2;
			System.out.print("Your pet is happy!");
		}
	}

	static void FeedPet(String Pettype) {
		if (Pettype.equals("dog")) {
			happinessLevel += 3;
			System.out.print("Your pet is  very happy!");
		}
	}

	static void AsleepPet(String Pettype) {
		if (Pettype.equals("Dog")) {
			happinessLevel += 1;
			System.out.print("Your pet isn' sad!");
		}
	}
	static void WalkPeT(String Pettype) {
		if(Pettype.equals("cat")) {
			happinessLevel-=1;
			System.out.print("Your pet is not happy!");
		}
	}
	static void FeedPeT(String Pettype) {
		if(Pettype.equals("cat")) {
			happinessLevel+=2;
			System.out.print("Your pet is happy!");
		}
	}
	static void WalkPet(String Pettype) {
		if(Pettype.equals("Dog")) {
			happinessLevel+=2;
			System.out.print("Your pet is happy!");
		}
	}
}
