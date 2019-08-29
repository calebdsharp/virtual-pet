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
		this.mailCount = 0;
		this.isBored = true;
		this.needMail = false;
	}

	public void tick() {
		hunger += 15;
		thirst += 10;
		tiredness += 10;
		boredom += 15;
		mailCount += 5;
	}
	
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
		mailCount -= mailCount;
	}
	
}
