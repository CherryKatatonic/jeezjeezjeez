package jeezjeezjeez;

import static org.junit.Assert.assertEquals;

import javax.swing.JLabel;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HoneyBeeSpec {

	HoneyBee honeyBee;
	
	@Before
	public void setUp() {
		honeyBee = new HoneyBee();
	}
	
	@BeforeClass
	public static void beforeAll() {
		Main.panel.add(new JLabel("[HONEY BEE TESTS]:"));
	}
	
	@AfterClass
	public static void afterAll() {
		Main.panel.add(new JLabel(" ")).repaint();
	}

	@Test
	public void testAge() {
		Main.panel.add(new JLabel("honeyBee.age: " + honeyBee.age));
		assertEquals("[ERROR] honeyBee.age != 10", 10, honeyBee.age);
	}

	@Test
	public void testColor() {
		Main.panel.add(new JLabel("honeyBee.color: " + honeyBee.color));
		assertEquals("[ERROR] honeyBee.color != yellow", "yellow", honeyBee.color);
	}
	
	@Test
	public void testJob() {
		Main.panel.add(new JLabel("honeyBee.job: " + honeyBee.job));
		assertEquals("[ERROR] honeyBee.job != `Make honey`", "Make honey", honeyBee.job);
	}
	
	@Test
	public void testFood() {
		Main.panel.add(new JLabel("honeyBee.food: " + honeyBee.food));
		assertEquals("[ERROR] honeyBee.food != `jelly`", "jelly", honeyBee.food);
	}
	
	@Test
	public void testEat() {
		Main.panel.add(new JLabel("honeyBee.eat(): " + honeyBee.eat()));
		assertEquals("[ERROR] honeyBee.eat != `Mmmmmm, jelly.`", "Mmmmmm, jelly.", honeyBee.eat());
	}
	
	@Test
	public void testHoneyPot() {
		Main.panel.add(new JLabel("honeyBee.honeyPot: " + honeyBee.honeyPot));
		assertEquals("[ERROR] honeyBee.honeyPot != 0", 0, honeyBee.honeyPot);
	}
	
	@Test
	public void testMakeHoney() {
		Main.panel.add(new JLabel("honeyBee.makeHoney: should add 1 to the honeyPot"));
		honeyBee.makeHoney();
		assertEquals("[ERROR] honeyBee.makeHoney didn't add to the honeyPot", 1, honeyBee.honeyPot);
	}
	
	@Test
	public void testGiveHoney() {
		Main.panel.add(new JLabel("honeyBee.giveHoney: should subtract 1 from the honeyPot"));
		honeyBee.makeHoney();
		honeyBee.makeHoney();
		honeyBee.giveHoney();
		assertEquals("[ERROR] honeyBee.giveHoney didn't subtract from the honeyPot", 1, honeyBee.honeyPot);
	}
	
}
