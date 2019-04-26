import java.awt.*;
import javax.swing.*;

public class Display{
	
	private static JFrame mapWindow, switchWindow;
	JRadioButton b1, b2;
	ButtonGroup bg;
	
	public Display(World w) {
		createWindow(w);
	}
	
	private void createWindow(World w) {
		World room = w;
		Tile[][] map = room.getTiles();
		mapWindow = new JFrame();
		switchWindow = new JFrame();
		
		mapWindow.setLayout(new GridLayout(15, 15));
		switchWindow.setLayout(new GridLayout());
		
				//set up tiles
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(map[i][j].isWall()) {
					ImageIcon image = new ImageIcon(getClass().getResource("wall.png"));
					JLabel label = new JLabel(image);
					mapWindow.add(label);
				}else {
					ImageIcon image = new ImageIcon(getClass().getResource("floor.png"));
					JLabel label = new JLabel(image);
					mapWindow.add(label);
				}
			}
		}
		
		//user selects between goal and start
		b1 = new JRadioButton("Adventurer");
		b1.setBounds(10, 10, 60, 30);
		switchWindow.add(b1);
		b2 = new JRadioButton("Goal", true);
		b2.setBounds(10, 10, 60, 30);
		switchWindow.add(b2);
		bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		
		
		mapWindow.setTitle("A* Map");
		mapWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mapWindow.setSize(480, 480);
		mapWindow.setLocationRelativeTo(null);
		mapWindow.setVisible(true);
		
		switchWindow.setTitle("Mouse Select");
		switchWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		switchWindow.setSize(300, 100);
		switchWindow.setLocationRelativeTo(mapWindow);
		switchWindow.setVisible(true);
		
		MouseInput mi = new MouseInput(true);
	}

}
