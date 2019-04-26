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
		Tile map[][] = new Tile[r][c];
		rand = new Random();
		int chance;
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				chance = rand.nextInt(10);
				if(chance < 9) {
					map[i][j] = new Tile("floor");
				}else {
					map[i][j] = new Tile("wall");
				}
			}
		}
		
		return map;
	}

	public Tile[][] getTiles() {
		return tiles;
	}

	public void setTiles(Tile[][] tileArray) {
		this.tiles = tileArray;
	}

}
