package jeezjeezjeez;

public class RetiredForager extends Forager {
	String forage() { return "I am too old, let me play cards instead."; }
	void gamble(Object treasure) { this.treasureChest.add(treasure); }

	public RetiredForager() {
		this.age += 30;
		this.job = "Gamble";
		this.canFly = false;
		this.color = "grey";
	}

}
