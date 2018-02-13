package jeezjeezjeez;

import static org.junit.Assert.assertEquals;

import javax.swing.JLabel;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeeSpec {

	Bee bee;
	
	@Before
	public void setUp() {
		bee = new Bee();
	}
	
	@BeforeClass
	public static void beforeAll() {
		Main.panel.add(new JLabel("[BEE TESTS]:"));
	}
	
	@AfterClass
	public static void afterAll() {
		Main.panel.add(new JLabel(" ")).repaint();
	}
	
	@Test
	public void testAge() {
		Main.panel.add(new JLabel("bee.age: " + bee.age));
		assertEquals("[ERROR] bee.age != 5", 5, bee.age);
	}

	@Test
	public void testColor() {
		Main.panel.add(new JLabel("bee.color: " + bee.color));
		assertEquals("[ERROR] bee.color != yellow", "yellow", bee.color);
	}
	
	@Test
	public void testJob() {
		Main.panel.add(new JLabel("bee.job: " + bee.job));
		assertEquals("[ERROR] bee.job != `Keep on growing`", "Keep on growing", bee.job);
	}
	
	@Test
	public void testFood() {
		Main.panel.add(new JLabel("bee.food: " + bee.food));
		assertEquals("[ERROR] bee.food != `jelly`", "jelly", bee.food);
	}
	
	@Test
	public void testEat() {
		Main.panel.add(new JLabel("bee.eat(): " + bee.eat()));
		assertEquals("[ERROR] bee.eat != `Mmmmmm, jelly.`", "Mmmmmm, jelly.", bee.eat());
	}

}
