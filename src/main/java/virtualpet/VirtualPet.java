package virtualpet;

public class VirtualPet {
	String name;
	Integer hunger;
	Integer thirst;
	Integer tiredness;
	Integer boredom;
	Boolean isbored;
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
	}
	
	public void status() {
		System.out.println("              " + name);
		System.out.println("________________________________");
		System.out.println();
		System.out.println("Hunger level:		|  " + hunger);
		System.out.println("Thirst level:		|  " + thirst);
		System.out.println("Boredom is:		|  " + boredom);
		System.out.println("Mail needs checked:	|  " + needMail);
	}
	
	public void firstSelection() {
		System.out.println(name + " is all set! What would you like to do first?");
		System.out.println();
		System.out.println("Make a selection using numbers 0 through 6: ");
		System.out.println("0. View Status");
		System.out.println("1. Feed " + name);
		System.out.println("2. Water " + name);
		System.out.println("3. Play fetch with " + name);
		System.out.println("4. Tell " + name + " to roll over");
		System.out.println("5. Ask " + name + " to shake");
		System.out.println("6. Have " + name + " check the mail");
		System.out.println();
		
	}
	public void selection() {
		System.out.println("What would you like to do next?");
		System.out.println();
		System.out.println("Make a selection using numbers 0 through 6: ");
		System.out.println("0. View Status");
		System.out.println("1. Feed " + name);
		System.out.println("2. Water " + name);
		System.out.println("3. Play fetch with " + name);
		System.out.println("4. Tell " + name + " to roll over");
		System.out.println("5. Ask " + name + " to shake");
		System.out.println("6. Have " + name + " check the mail");
		System.out.println();
		
	}
	
	public void feed() {
		System.out.println("You feed " + name + ". Mmmmmmmm");
		System.out.println();
		hunger -= 5;
		thirst += 5;
		tick();
	}
	
	public void water() {
		System.out.println("You give " + name + " water.");
		System.out.println();
		thirst -= 5;
		hunger -= 5;
		tick();
	}
	
	public void fetch() {
		System.out.println("You play fetch with " + name + ". ");
		System.out.println();
		boredom -= 20;
		tiredness -= 10;
		hunger += 15;
		thirst += 10;
		tick();
	}
	
	public void rollOver() {
		System.out.println("You ask " + name + " to roll over.");
		System.out.println();
		boredom -= 10;
		tiredness -= 5;
		hunger += 5;
		thirst += 5;
		tick();
	}
	
	public void shake() {
		System.out.println(name + " shakes your hand!");
		System.out.println();
		boredom -= 5;
		tick();
	}
	
	public void checkMail() {
		System.out.println(name + " checks the mail. Maybe there will be somehting fun in there!!");
		System.out.println();
	}
	
}
