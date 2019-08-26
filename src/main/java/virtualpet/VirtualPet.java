package virtualpet;

public class VirtualPet {
	String name;
	Integer hunger;
	Integer thirst;
	Boolean boredom;
	Boolean needMail;
	
	
	public VirtualPet(String name) {
		this.name = name;
		this.hunger = 15;
		this.thirst = 15;
		this.boredom = false;
		this.needMail = false;
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
	
	public void selection() {
		System.out.println("Make a selection: ");
		System.out.println("1. Feed " + name);
		System.out.println("2. Water " + name);
		System.out.println("3. Play fetch with " + name);
		System.out.println("4. Tell " + name + " to roll over");
		System.out.println("5. Ask " + name + " to shake");
		System.out.println("6. Have " + name + " check the mail");
	}
	
	public void feed() {
		System.out.println("You feed " + name + ".");
		hunger -= 5;
	}
	
	public void water() {
		System.out.println("You give " + name + " water.");
		thirst -= 5;
	}
	
	
	
}
