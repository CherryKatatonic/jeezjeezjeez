package jeezjeezjeez;

import java.util.ArrayList;

public class Forager extends Bee {
	boolean canFly;
	ArrayList<Object> treasureChest = new ArrayList<Object>();
	
	void forage(Object treasure) {
		this.treasureChest.add(treasure);
	}
	
	public Forager() {
		this.age += 5;
		this.job = "Find pollen";
		this.canFly = true;
	}

}
