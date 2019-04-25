import java.awt.*;
import javax.swing.*;

public class Display {
	
	private static JFrame window;
	
	public Display() {
		createWindow();
	}
	
	private void createWindow() {
		window = new JFrame("A* Map");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setLocationRelativeTo(null);
		window.pack();
		window.setVisible(true);
	}

}
