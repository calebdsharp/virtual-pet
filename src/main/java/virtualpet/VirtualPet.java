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
	
	public void feed() {
		System.out.println("You feed " + name + ".");
		hunger -= 5;
	}
	
	public void water() {
		System.out.println("You give " + name + " water.");
		thirst -= 5;
	}
	
	
	
}
