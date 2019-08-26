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

	}

	public static String introduction() {
		System.out.println("Hello, welcome to your virtual pet game!");
//		System.out.println();
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
		System.out.println("Great! Now, lets give your " + petType + " a name.");
		promptEnterKey();
		System.out.print("Enter your " + petType + "'s name: ");
		String petName;
		petName = input.nextLine();
		System.out.println();
		System.out.println("WOW! What an awesome name!!");
		promptEnterKey();
		System.out.println();
		System.out.println("We hope you enjoy taking care of " + petName + ". Next, you will be given an option menu where you" +
		" can make selections for what \n"
				+ "you would like to do with your new best friend. Remember, you can enter \"0\" to check " 
				+ petName + "'s status at any time."
						+ "\n\n" + "Have Fun!");
		System.out.println();
		promptEnterKey();
		return petName;
	}
	
	public static void promptEnterKey() {
		System.out.println("Press \"ENTER\" to continue...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
	

}
