
public class Tile {
	
	boolean wall;
	String floor;
	
	Tile(String f){
		
		floor = f;
		
		if(f == "wall") {
			wall = true;
		}
		
	}

	public String getFloor() {
		return floor;
	}

	public boolean isWall() {
		return wall;
	}

}
