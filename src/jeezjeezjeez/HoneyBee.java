package jeezjeezjeez;

public class HoneyBee extends Bee {
	int honeyPot;
	
	void makeHoney() { this.honeyPot++; }
	void giveHoney() { this.honeyPot--; }

	public HoneyBee() {
		this.age += 5;
		this.job = "Make honey";
		this.honeyPot = 0;
	}

}
