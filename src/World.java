import java.util.Random;

public class World {
	
	Tile tiles[][];
	Random rand;
	
	public World() {
		
		int rows = 15;
		int columns = 15;
		
		tiles = createWalls(rows, columns);
		
	}
	
	//a simple randomizer to place walls within the room
	public Tile[][] createWalls(int r, int c){
		Tile room[][] = new Tile[r][c];
		rand = new Random();
		int chance;
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				chance = rand.nextInt(10);
				if(chance < 8) {
					room[i][j] = new Tile("floor");
				}else {
					room[i][j] = new Tile("wall");
				}
			}
		}
		
		return room;
	}

	public Tile[][] getTiles() {
		return tiles;
	}

	public void setTiles(Tile[][] tileArray) {
		this.tiles = tileArray;
	}

}
