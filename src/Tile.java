
public class Tile {
	//simple class to hold multiple tile variables
	
	boolean wall;//means the AI can't walk through this tile
	String floor;//establishes what image the display will contain
	int x, y;
	
	Tile(String f, int r, int c){
		
		floor = f;
		x = r;
		y = c;
		
		if(f == "wall") {
			wall = true;
		}
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getFloor() {
		return floor;
	}

	public boolean isWall() {
		return wall;
	}

}
