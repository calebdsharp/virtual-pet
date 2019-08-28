package virtualpet;

public class VirtualPet {
	String name;
	Integer hunger;
	Integer thirst;
	Integer tiredness;
	Integer boredom;
	Integer mailCount;
	Boolean isBored;
	Boolean needMail;
	
	
	public VirtualPet(String name) {
		this.name = name;
		this.hunger = 15;
		this.thirst = 15;
		this.tiredness = 5;
		this.boredom = 25;
		this.needMail = false;
	}
	
	public void tick() {
		hunger += 15;
		thirst += 10;
		tiredness += 10;
		boredom += 15;
		mailCount += 5;
	}
	
	
	public void firstSelection() {
//		System.out.println(name + " is all set! What would you like to do first?");
//		System.out.println();
//		System.out.println("Make a selection using numbers 0 through 6: ");
//		System.out.println("0. View Status");
//		System.out.println("1. Feed " + name);
//		System.out.println("2. Water " + name);
//		System.out.println("3. Play fetch with " + name);
//		System.out.println("4. Tell " + name + " to roll over");
//		System.out.println("5. Ask " + name + " to shake");
//		System.out.println("6. Have " + name + " check the mail");
//		System.out.println();
//		
	}
//	public void selection() {
//		System.out.println("What would you like to do next?");
//		System.out.println();
//		System.out.println("Make a selection using numbers 0 through 6: ");
//		System.out.println("0. View Status");
//		System.out.println("1. Feed " + name);
//		System.out.println("2. Water " + name);
//		System.out.println("3. Play fetch with " + name);
//		System.out.println("4. Tell " + name + " to roll over");
//		System.out.println("5. Ask " + name + " to shake");
//		System.out.println("6. Have " + name + " check the mail");
//		System.out.println();
//		
//	}
	
	public void feed() {
		hunger -= 5;
		thirst += 5;
		tick();
	}
	
	public void water() {
		thirst -= 5;
		hunger -= 5;
		tick();
	}
	
	public void fetch() {
		boredom -= 20;
		tiredness += 10;
		hunger += 15;
		thirst += 10;
		tick();
	}
	
	public void rollOver() {
		boredom -= 10;
		tiredness += 5;
		hunger += 5;
		thirst += 5;
		tick();
	}
	
	public void shake() {
		boredom -= 5;
		tick();
	}
	
	public void sleep() {
		tiredness -= 20;
		hunger += 5;
	}
	
	public void checkMail() {
	}
	
}
