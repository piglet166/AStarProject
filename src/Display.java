import java.awt.*;
import javax.swing.*;

public class Display{
	
	private static JFrame window;
	JRadioButton b1, b2;
	ButtonGroup bg;
	
	public Display(World w) {
		createWindow(w);
	}
	
	private void createWindow(World w) {
		World room = w;
		Tile[][] map = room.getTiles();
		window = new JFrame();
		
		window.setLayout(new GridLayout(15, 15));
		
		//user selects between goal and start
		b1 = new JRadioButton("Adventurer");
		b1.setBounds(10, 10, 60, 30);
		window.add(b1);
		b2 = new JRadioButton("Goal");
		b2.setBounds(10, 10, 60, 30);
		window.add(b2);
		bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		
		
		
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
		window.setSize(480, 540);
		window.setVisible(true);
	}

}
