package jeezjeezjeez;

import javax.swing.JLabel;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SpecRunner {

	public static void runTests() {	
		Result result = JUnitCore.runClasses(GrubSpec.class, BeeSpec.class,
				HoneyBeeSpec.class, ForagerSpec.class, RetiredForagerSpec.class);
		
		if (result.getFailureCount() > 0) {
			Main.panel.add(new JLabel("[FAILURES]:"));
			for (Failure failure : result.getFailures()) {
				Main.panel.add(new JLabel(failure.toString()));
			}
			Main.panel.add(new JLabel(" "));
		}
		
		Main.panel.add(new JLabel("[TESTING COMPLETE]"));
	}

}
