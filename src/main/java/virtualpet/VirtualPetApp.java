package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String petName = introduction();
		VirtualPet pet = new VirtualPet(petName);
		status(pet);
		promptEnterKey();
		System.out.println();
		firstSelection(pet);
		int makeSelection = -1;

		while (pet.hunger <= 200 && pet.thirst <= 200 && pet.tiredness <= 200 && pet.boredom <= 200) {
			makeSelection = readInput();
			switch (makeSelection) {
			case 0:
				status(pet);
				break;
			case 1:
				if (pet.thirst > 100 && pet.hunger < 75) {
					System.out.println(pet.name + " is really thirsty. Consider food instead");
					break;
				}

				System.out.println("You feed " + pet.name + ". Mmmmmmmm");
				System.out.println();
				pet.feed();
				break;
			case 2:
				if (pet.hunger > 100 && pet.thirst < 75) {
					System.out.println("You should think about feeding " + pet.name + ".");
					break;
				}

				System.out.println("You give " + pet.name + " water. Gulp, Gulp, Gulp.");
				System.out.println();
				pet.water();
				break;
			case 3:
				if (pet.hunger > 100) {
					System.out.println(pet.name + " is too hungry to be chasing after things right now.");
					System.out.println();
					break;
				} else if (pet.thirst > 100) {
					System.out.println(pet.name + " is too thirsty to be running around.");
					System.out.println();
					break;
				} else if (pet.tiredness > 50) {
					System.out.println(pet.name + " is looking pretty tired.");
					System.out.println();
					break;
				}

				System.out.println("You play fetch with " + pet.name + ". Wooohoooo!");
				System.out.println();
				pet.fetch();
				break;
			case 4:
				if (pet.tiredness > 50) {
					System.out.println("Lets get " + pet.name + " some sleep. Zzzzzzzz");
					break;
				}

				System.out.println("You ask " + pet.name + " to roll over. Way to go!");
				System.out.println();
				pet.rollOver();
				break;
			case 5:
				if (pet.tiredness > 50) {
					System.out.println("Lets get " + pet.name + " some sleep. Zzzzzzzz");
					break;
				}

				System.out.println(pet.name + " shakes your hand! Very impressive.");
				System.out.println();
				pet.shake();
				break;
			case 6:
				System.out.println(pet.name + " checks the mail. Maybe there will be something fun in there!!");
				System.out.println();
				pet.checkMail();
				break;
			case 7:
				System.out.println("Nap time! Zzzzzzzzz");
				System.out.println();
				pet.sleep();
				break;
			}

			if (pet.mailCount > 25) {
				System.out.println("The mail is getting out of control!");
				System.out.println();
			}

			promptEnterKey();
			selection(pet);
		}

		if (pet.hunger > 200 || pet.thirst > 200 || pet.tiredness > 200 || pet.boredom > 200) {
			System.out.println(pet.name + " didn't get the attention they needed. \n\n" + "Game Over.");
		}

		status(pet);
	}

	static String introduction() {
		System.out.println("Hello, welcome to your virtual pet game!");
		System.out.println();
		promptEnterKey();
		System.out.println("In this game you will decide what type of pet you want and choose a name for it. \n"
				+ "You will also be able to make choices for what to do with your pet, based on how it is feeling. \n"
				+ "Enter \"0\" in the selection menu to view your pets status.");
		System.out.println();
		System.out.println("This is so exciting! Let's get started.");
		System.out.println();
		promptEnterKey();
		System.out.print("Please enter the type of pet you want and press enter: ");
		String petType = "";
		while (input.hasNextInt()) {
			@SuppressWarnings("unused")
			String petTypeInput = input.nextLine();
			System.out.print("Enter your pets type using text: ");
		}

		if (input.hasNextLine()) {
			petType = input.nextLine();
		}

		System.out.println();
		System.out.print("Great! Now enter your new " + petType + "'s name and press enter: ");
		String petName = "";
		while (input.hasNextInt()) {
			@SuppressWarnings("unused")
			String petNameInput = input.nextLine();
			System.out.print("Enter your pets name using text: ");
		}

		if (input.hasNextLine()) {
			petName = input.nextLine();
		}

		System.out.println();
		System.out.println("WOW! What an awesome name!! We hope you enjoy taking care of " + petName + ".");
		System.out.println();
		promptEnterKey();
		System.out.println();
		System.out.println("Next, you will be given an option menu where you" + " can make selections for what \n"
				+ "you would like to do with your new best friend. \n\n" + "Please keep in mind if " + petName
				+ "'s hunger, thirst, tiredness, or boredom" + " levels reach 200 or more, the game will end. \n"
				+ "Remember, you can enter \"0\" in the selection menu to check " + petName + "'s status at any time."
				+ "\n\n" + "Have Fun!");
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

	static void firstSelection(VirtualPet pet) {
		System.out.println(pet.name + " is all set! What would you like to do first?");
		System.out.println();
		System.out.println("Make a selection using numbers 0 through 7: ");
		System.out.println("0. View Status");
		System.out.println("1. Feed " + pet.name);
		System.out.println("2. Water " + pet.name);
		System.out.println("3. Play fetch with " + pet.name);
		System.out.println("4. Tell " + pet.name + " to roll over");
		System.out.println("5. Ask " + pet.name + " to shake");
		System.out.println("6. Have " + pet.name + " check the mail");
		System.out.println("7. Take a nap with " + pet.name);
		System.out.println();
	}

	static void selection(VirtualPet pet) {
		System.out.println("What would you like to do next?");
		System.out.println();
		System.out.println("Make a selection using numbers 0 through 7: ");
		System.out.println("0. View Status");
		System.out.println("1. Feed " + pet.name);
		System.out.println("2. Water " + pet.name);
		System.out.println("3. Play fetch with " + pet.name);
		System.out.println("4. Tell " + pet.name + " to roll over");
		System.out.println("5. Ask " + pet.name + " to shake");
		System.out.println("6. Have " + pet.name + " check the mail");
		System.out.println("7. Take a nap with " + pet.name);
		System.out.println();
	}

	static void status(VirtualPet pet) {
		System.out.println("              " + pet.name);
		System.out.println("________________________________");
		System.out.println();
		System.out.println("Hunger level:		|  " + pet.hunger);
		System.out.println("Thirst level:		|  " + pet.thirst);
		System.out.println("Tiredness level:	|  " + pet.tiredness);
		System.out.println("Boredom level:  	|  " + pet.boredom);
		System.out.println("Mail count:     	|  " + pet.mailCount);
		System.out.println();
	}

	private static int readInput() {
		int selection = -1;
		if (!input.hasNextInt()) {
			@SuppressWarnings("unused")
			String makeSelectionInput = input.next();
			System.out.println("Please enetr your selection as a number. Valid numbers are 0 through 7. \n"
					+ "Please make a valid entry: ");
			selection = readInput();
		} else if (input.hasNextInt()) {
			selection = input.nextInt();
			if (selection < 0 || selection > 7) {
				System.out.println("Valid numbers are 0 through 7. \n" + "Please make a valid entry: ");
				selection = readInput();
			}
		}

		return selection;

	}
}
