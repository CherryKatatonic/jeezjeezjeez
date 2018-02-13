package jeezjeezjeez;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Main {
	
// Init static jPanel so other classes can access it
	static JPanel panel;

// Init application
	public static void main(String[] args) {
		
	// Init variables
		JFrame frame;
		BoxLayout layout;
		JScrollPane scrollPane;
		Container container;
		
	// Configure jFrame
		frame = new JFrame("Swing");
		frame.setBounds(50, 50, 600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	// Configure panel layouts
		panel = new JPanel();
		layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(layout);
		scrollPane = new JScrollPane(panel);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10);
		container = frame.getContentPane();
	    container.add(scrollPane);
	    
	// Run tests and show results
	    SpecRunner.runTests();
	    frame.setVisible(true);
	    
	}

}
