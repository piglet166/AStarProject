
public class Tile {
	//simple class to hold multiple tile variables
	
	boolean wall;//means the AI can't walk through this tile
	String floor;//establishes what image the display will contain
	
	Tile(String f){
		
		floor = f;
		
		if(f == "wall") {
			wall = true;
		}
		
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
