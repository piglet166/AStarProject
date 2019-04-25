import java.awt.*;
import javax.swing.*;

public class Display{
	
	private static JFrame window;
	
	public Display(World w) {
		createWindow(w);
	}
	
	private void createWindow(World w) {
		World room = w;
		Tile[][] map = room.getTiles();
		window = new JFrame();
		window.setLayout(new GridLayout(15, 15));
		
		//set up tiles
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(map[i][j].isWall()) {
					ImageIcon image = new ImageIcon(getClass().getResource("wall.png"));
					JLabel label = new JLabel(image);
					window.add(label);
				}else {
					ImageIcon image = new ImageIcon(getClass().getResource("floor.png"));
					JLabel label = new JLabel(image);
					window.add(label);
				}
			}
		}
		window.setTitle("A* Map");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.pack();
		window.setVisible(true);
	}

}
