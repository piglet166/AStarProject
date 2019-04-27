import java.awt.Point;
import java.awt.event.MouseEvent;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World room = new World();
		AIuser user = new AIuser(room);
		Display window = new Display(room, user);
		MouseEvent e = null;
		
		//console display for testing purposes
		Tile[][] map = room.getTiles();
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print("["+map[i][j].getFloor()+"] ");
			}
			System.out.println();
		}
		while(true) {
			if(user.tileSelect) {
				System.out.println("working");
				user.setTileSelect(false);
			}
		}
	}
}
