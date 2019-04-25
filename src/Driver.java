
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World room = new World();
		Tile[][] map = room.getTiles();
		
		Display window = new Display();
		
		
		
		
		//console display for testing purposes
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print("["+map[i][j].getFloor()+"] ");
			}
			System.out.println();
		}
	}
}
