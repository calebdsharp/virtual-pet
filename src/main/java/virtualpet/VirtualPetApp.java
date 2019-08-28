package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String petName = introduction();
		VirtualPet pet = new VirtualPet(petName);

//		pet.status();
		System.out.println("              " + pet.name);
		System.out.println("________________________________");
		System.out.println();
		System.out.println("Hunger level:		|  " + pet.hunger);
		System.out.println("Thirst level:		|  " + pet.thirst);
		System.out.println("Tiredness level:	|  " + pet.tiredness);
		System.out.println("Boredom is:		|  " + pet.boredom);
		System.out.println("Mail needs checked:	|  " + pet.needMail);
		System.out.println();

//		System.out.println();
		promptEnterKey();
//		pet.firstSelection();
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
		

		int makeSelection = -1;

		while (pet.hunger <= 200 && pet.thirst <= 200 && pet.tiredness <= 200 && pet.boredom <= 200) {
			makeSelection = readInput();
//			if(pet.mailCount > 25) {
//				pet.needMail = true;
//				System.out.println("I think it's time " + pet.name + " checked the mail.");
//			}
				switch (makeSelection) {
				case 0:
//					pet.status();
					System.out.println("              " + pet.name);
					System.out.println("________________________________");
					System.out.println();
					System.out.println("Hunger level:		|  " + pet.hunger);
					System.out.println("Thirst level:		|  " + pet.thirst);
					System.out.println("Tiredness level:	|  " + pet.tiredness);
					System.out.println("Boredom is:		|  " + pet.boredom);
					System.out.println("Mail needs checked:	|  " + pet.needMail);
					System.out.println();
					break;
				case 1:
//					if(pet.thirst > 100 && pet.hunger < 75) {
//						System.out.println(pet.name + " is really thirsty. Consider food instead");
//						break;
//					}
					System.out.println("You feed " + pet.name + ". Mmmmmmmm");
					System.out.println();
					pet.feed();
					break;
				case 2:
//					if(pet.hunger > 100 && pet.thirst < 75) {
//						System.out.println("You should think about feeding " + pet.name + ".");
//						break;
//					}
					System.out.println("You give " + pet.name + " water. Gulp, Gulp, Gulp.");
					System.out.println();
					pet.water();
					break;
				case 3:
//					if(pet.hunger > 100) {
//						System.out.println(pet.name + " is to hungry to be chasing after things right now.");
//						break;
//					} else if(pet.thirst > 100) {
//						System.out.println(pet.name + " is to thirsty to be running around.");
//						break;
//					} else if(pet.tiredness > 50) {
//						System.out.println("Lets get " + pet.name + " some sleep. Zzzzzzzz");
//						break;
//					}
					System.out.println("You play fetch with " + pet.name + ". Wooohoooo!");
					System.out.println();
					pet.fetch();
					break;
				case 4:
//					if(pet.tiredness > 50) {
//						System.out.println("Lets get " + pet.name + " some sleep. Zzzzzzzz");
//						break;
//					}
					System.out.println("You ask " + pet.name + " to roll over. Way to go!");
					System.out.println();
					pet.rollOver();
					break;
				case 5:
//					if(pet.tiredness > 50) {
//						System.out.println("Lets get " + pet.name + " some sleep. Zzzzzzzz");
//						break;
//					}
					System.out.println(pet.name + " shakes your hand! Very impressive ;)");
					System.out.println();
					pet.shake();
					break;
				case 6:
					System.out.println(pet.name + " checks the mail. Maybe there will be somehting fun in there!!");
					System.out.println();
					pet.checkMail();
					break;
				case 7:
					System.out.println("Nap time!");
					System.out.println();
					pet.sleep();
					break;
				}
				promptEnterKey();
//				pet.selection();
				System.out.println("What would you like to do next?");
				System.out.println();
				System.out.println("Make a selection using numbers 0 through 6: ");
				System.out.println("0. View Status");
				System.out.println("1. Feed " + pet.name);
				System.out.println("2. Water " + pet.name);
				System.out.println("3. Play fetch with " + pet.name);
				System.out.println("4. Tell " + pet.name + " to roll over");
				System.out.println("5. Ask " + pet.name + " to shake");
				System.out.println("6. Have " + pet.name + " check the mail");
				System.out.println();
			}
		if(pet.hunger > 200 || pet.thirst > 200 || pet.tiredness > 200 || pet.boredom > 200) {
			System.out.println(pet.name + "didn't get the attention they needed. \n\n"
					+ "Game Over.");
		} 
//		status();
//		System.out.println("              " + pet.name);
//		System.out.println("________________________________");
//		System.out.println();
//		System.out.println("Hunger level:		|  " + pet.hunger);
//		System.out.println("Thirst level:		|  " + pet.thirst);
//		System.out.println("Tiredness level:	|  " + pet.tiredness);
//		System.out.println("Boredom is:		|  " + pet.boredom);
//		System.out.println("Mail needs checked:	|  " + pet.needMail);
//		System.out.println();
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
		System.out.print("Please enter the type of pet you want and press enter: ");
		String petType;
		petType = input.nextLine();
		System.out.println();
		System.out.print("Great! Now enter your new " + petType + "'s name and press enter: ");
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
	
	static void status(String name, Integer hunger, Integer thirst, Integer tiredness, Integer boredom, Boolean needMail) {
		System.out.println("              " + name);
		System.out.println("________________________________");
		System.out.println();
		System.out.println("Hunger level:		|  " + hunger);
		System.out.println("Thirst level:		|  " + thirst);
		System.out.println("Tiredness level:	|  " + tiredness);
		System.out.println("Boredom is:		|  " + boredom);
		System.out.println("Mail needs checked:	|  " + needMail);
		System.out.println();
		}

	private static int readInput() {
		int selection = -1;
		if(!input.hasNextInt()) {
			String makeSelectionInput = input.next();
			System.out.println("Please enetr your selection as a number. Valid numbers are 0 through 6.");
			selection  = readInput();
		} else if(input.hasNextInt()) {
			selection = input.nextInt();
			if(selection < 0 || selection > 7) {
				System.out.println("Valid numbers are 0 through 7.");
				selection = readInput();
			}
		}
		return selection;
	}

}
