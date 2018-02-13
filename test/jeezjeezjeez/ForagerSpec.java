package jeezjeezjeez;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import javax.swing.JLabel;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForagerSpec {
	
	Forager forager;
	
	@Before
	public void setUp() {
		forager = new Forager();
	}
	
	@BeforeClass
	public static void beforeAll() {
		Main.panel.add(new JLabel("[FORAGER TESTS]:"));
	}
	
	@AfterClass
	public static void afterAll() {
		Main.panel.add(new JLabel(" ")).repaint();
	}
	
	@Test
	public void testAge() {
		Main.panel.add(new JLabel("forager.age: " + forager.age));
		assertEquals("[ERROR] forager.age != 10", 10, forager.age);
	}

	@Test
	public void testColor() {
		Main.panel.add(new JLabel("forager.color: " + forager.color));
		assertEquals("[ERROR] forager.color != yellow", "yellow", forager.color);
	}
	
	@Test
	public void testJob() {
		Main.panel.add(new JLabel("forager.job: " + forager.job));
		assertEquals("[ERROR] forager.job != `Find pollen`", "Find pollen", forager.job);
	}
	
	@Test
	public void testFood() {
		Main.panel.add(new JLabel("forager.food: " + forager.food));
		assertEquals("[ERROR] forager.food != `jelly`", "jelly", forager.food);
	}
	
	@Test
	public void testEat() {
		Main.panel.add(new JLabel("forager.eat(): " + forager.eat()));
		assertEquals("[ERROR] forager.eat != `Mmmmmm, jelly.`", "Mmmmmm, jelly.", forager.eat());
	}
	
	@Test
	public void testCanFly() {
		Main.panel.add(new JLabel("forager.canFly: " + forager.canFly));
		assertEquals("[ERROR] forager.canFly != true", true, forager.canFly);
	}
	
	@Test
	public void testTreasureChest() {
		Main.panel.add(new JLabel("forager.treasureChest: " + forager.treasureChest));
		Object[] emptyArray = {};
		assertArrayEquals("[ERROR] retiredForager.treasureChest != empty array", 
				emptyArray, forager.treasureChest.toArray());
	}
	
	@Test
	public void testForage() {
		Main.panel.add(new JLabel("forager.forage() should add to the treasure chest"));
		Object[] shinyArray = {"shiny!"};
		forager.forage("shiny!");
		assertArrayEquals("[ERROR] retiredForager.forage() didn't add to the treasure chest",
				shinyArray, forager.treasureChest.toArray());
	}

}
