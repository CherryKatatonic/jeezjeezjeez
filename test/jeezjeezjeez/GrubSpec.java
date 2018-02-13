package jeezjeezjeez;

import static org.junit.Assert.assertEquals;

import javax.swing.JLabel;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GrubSpec {
	
	Grub grub;
	
	@Before
	public void beforeEach() {
		grub = new Grub();
	}
	
	@BeforeClass
	public static void beforeAll() {
		Main.panel.add(new JLabel("[GRUB TESTS]:"));
	}
	
	@AfterClass
	public static void afterAll() {
		Main.panel.add(new JLabel(" ")).repaint();
	}

	@Test
	public void testAge() {
		Main.panel.add(new JLabel("grub.age: " + grub.age));
		assertEquals("[ERROR] grub.age != 0", 0, grub.age);
	}
	
	@Test
	public void testColor() {
		Main.panel.add(new JLabel("grub.color: " + grub.color));
		assertEquals("[ERROR] grub.color != `pink`", "pink", grub.color);
	}
	
	@Test
	public void testFood() {
		Main.panel.add(new JLabel("grub.food: " + grub.food));
		assertEquals("[ERROR] grub.food != `jelly`", "jelly", grub.food);
	}
	
	@Test
	public void testEat() {
		Main.panel.add(new JLabel("grub.eat(): " + grub.eat()));
		assertEquals("[ERROR] grub.eat != `Mmmmmm, jelly.`", "Mmmmmm, jelly.", grub.eat());
	}
		
}
