package jeezjeezjeez;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import javax.swing.JLabel;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RetiredForagerSpec {
	
	RetiredForager retiredForager;
	
	@Before
	public void setUp() {
		retiredForager = new RetiredForager();
	}
	
	@BeforeClass
	public static void beforeAll() {
		Main.panel.add(new JLabel("[RETIRED FORAGER TESTS]:"));
	}
	
	@AfterClass
	public static void afterAll() {
		Main.panel.add(new JLabel(" ")).repaint();
	}
	
	@Test
	public void testAge() {
		Main.panel.add(new JLabel("retiredForager.age: " + retiredForager.age));
		assertEquals("[ERROR] retiredForager.age != 40", 40, retiredForager.age);
	}

	@Test
	public void testColor() {
		Main.panel.add(new JLabel("retiredForager.color: " + retiredForager.color));
		assertEquals("[ERROR] retiredForager.color != grey", "grey", retiredForager.color);
	}
	
	@Test
	public void testJob() {
		Main.panel.add(new JLabel("retiredForager.job: " + retiredForager.job));
		assertEquals("[ERROR] retiredForager.job != `Gamble`", "Gamble", retiredForager.job);
	}
	
	@Test
	public void testFood() {
		Main.panel.add(new JLabel("retiredForager.food: " + retiredForager.food));
		assertEquals("[ERROR] retiredForager.food != `jelly`", "jelly", retiredForager.food);
	}
	
	@Test
	public void testEat() {
		Main.panel.add(new JLabel("retiredForager.eat(): " + retiredForager.eat()));
		assertEquals("[ERROR] retiredForager.eat != `Mmmmmm, jelly.`",	
				"Mmmmmm, jelly.", retiredForager.eat());
	}
	
	@Test
	public void testCanFly() {
		Main.panel.add(new JLabel("retiredForager.canFly: " + retiredForager.canFly));
		assertEquals("[ERROR] retiredForager.canFly != false", false, retiredForager.canFly);
	}
	
	@Test
	public void testTreasureChest() {
		Main.panel.add(new JLabel("retiredForager.treasureChest: " + retiredForager.treasureChest));
		Object[] emptyArray = {};
		assertArrayEquals("[ERROR] retiredForager.treasureChest != empty array", 
				emptyArray, retiredForager.treasureChest.toArray());
	}
	
	@Test
	public void testForage() {
		Main.panel.add(new JLabel("retiredForager.forage(): " + retiredForager.forage()));
		assertEquals("[ERROR] retiredForager.forage() didn't return `I am "
				+ "too old, let me play cards instead.`",
				"I am too old, let me play cards instead.", retiredForager.forage());
	}

	@Test
	public void testGamble() {
		String winnings = "$1";
		Object[] richArray = {winnings};
		retiredForager.gamble(winnings);
		Main.panel.add(new JLabel("retiredForager.gamble() should add to the treasure chest"));
		assertArrayEquals("[ERROR] retiredForager.gamble() didn't add to the treasure chest",
				richArray, retiredForager.treasureChest.toArray());
	}

}
