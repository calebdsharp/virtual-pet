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
		pet.firstSelection();

		int makeSelection = -1;

		while (pet.hunger <= 200 && pet.thirst <= 200 && pet.tiredness <= 200 && pet.boredom <= 200) {
			makeSelection = readInput();
			
				switch (makeSelection) {
				case 0:
					pet.status();
					promptEnterKey();
					break;
				case 1:
					pet.feed();
					promptEnterKey();
					break;
				case 2:
					pet.water();
					promptEnterKey();
					break;
				case 3:
					pet.fetch();
					promptEnterKey();
					break;
				case 4:
					pet.rollOver();
					promptEnterKey();
					break;
				case 5:
					pet.shake();
					promptEnterKey();
					break;
				case 6:
					pet.checkMail();
					promptEnterKey();
					break;
				}
				pet.selection();
			}
		if(pet.hunger > 200 || pet.thirst > 200 || pet.tiredness > 200 || pet.boredom > 200) {
			System.out.println(pet.name + "didn't get the attention they needed. \n\n"
					+ "Game Over.");
		} 
		pet.status();
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
	
	private static int readInput() {
		int selection = -1;
		if(!input.hasNextInt()) {
			String makeSelectionInput = input.next();
			System.out.println("Please enetr your selection as a number. Valid numbers are 0 through 6.");
			selection  = readInput();
		} else if(input.hasNextInt()) {
			selection = input.nextInt();
			if(selection < 0 || selection > 6) {
				System.out.println("Valid numbers are 0 through 6.");
				selection = readInput();
			}
		}
		return selection;
	}

}
