package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String petName = introduction();
		VirtualPet pet = new VirtualPet(petName);

		pet.status();
		System.out.println();
		promptEnterKey();
		pet.selection();

		int makeSelection = 0;
		while (!input.hasNextInt()) {
			String makeSelectionInput = input.next();
			System.out.println("Please enter your selection as a number. Valid numbers are 0 through 6.");

//		int makeSelection = 0;
//		makeSelection = input.nextInt();

			while (input.hasNextInt()) {
				makeSelection = input.nextInt();
				if (makeSelection < 0 || makeSelection > 6) {
					System.out.println("Valid numbers are 0 through 6.");
				} else {
					break;
				}
			}
		}

		makeSelection = input.nextInt();
		switch (makeSelection) {
		case 0:
			pet.selection();
			break;
		case 1:
			pet.feed();
			break;
		case 2:
			pet.water();
			break;
		case 3:
			pet.fetch();
			break;
		case 4:
			pet.rollOver();
			break;
		case 5:
			pet.shake();
			break;
		case 6:
			pet.checkMail();
			break;
		}
	}

	static String introduction() {
		System.out.println("Hello, welcome to your virtual pet game!");
		promptEnterKey();
		System.out.println("In this game you will decide what type of pet you want and choose a name for it. \n"
				+ "You will also be able to make choices for what to do with your pet, based on how it is feeling. \n"
				+ "Whenever you want to check the status of your pet, just enter '0'.");
		System.out.println();
		System.out.println("This is so exciting! Let's get started.");
		promptEnterKey();
		System.out.print("Please enter the type of pet you want: ");
		String petType;
		petType = input.nextLine();
		System.out.println();
		System.out.print("Great! Now enter your new " + petType + "'s name: ");
//		promptEnterKey();
//		System.out.print("Enter your " + petType + "'s name: ");
		String petName;
		petName = input.nextLine();
		System.out.println();
		System.out.println("WOW! What an awesome name!!");
		promptEnterKey();
		System.out.println();
		System.out.println("We hope you enjoy taking care of " + petName
				+ ". Next, you will be given an option menu where you" + " can make selections for what \n"
				+ "you would like to do with your new best friend. Remember, you can enter \"0\" to check " + petName
				+ "'s status at any time." + "\n\n" + "Have Fun!");
		System.out.println();
		promptEnterKey();
		return petName;
	}

	static void promptEnterKey() {
		System.out.println("Press \"ENTER\" to continue...");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

}
