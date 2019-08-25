package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String petName = introduction();
		VirtualPet pet = new VirtualPet(petName);
		
		

	}

	public static String introduction() {
		System.out.println("Hello, welcome to your virtual pet game!");

		System.out.println("Please choose the type of pet you want: ");
		String petType;
		petType = input.nextLine();
		System.out.println("Great! Now, lets give your " + petType + " a name.");

		System.out.println("Enter your " + petType + "'s name: ");
		String petName;
		petName = input.nextLine();

		System.out.println("This is so exciting! Let's get " + petName + " all set up.");
		return petName;
	}

}
