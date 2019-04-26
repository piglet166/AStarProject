import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AIuser implements ItemListener, MouseListener{
	
	String movementArray[] = {"Up", "Down", "Left", "Right"};
	String choiceArray[] = {"A", "G"};
	boolean tileSelect;
	
	public AIuser() {
		
		tileSelect = false;
		
	}
	
	public boolean isTileSelect() {
		return tileSelect;
	}

	public void setTileSelect(boolean tileSelect) {
		this.tileSelect = tileSelect;
	}

	public String[] getChoiceArray() {
		return choiceArray;
	}

	public String[] getMovementArray() {
		return movementArray;
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		System.out.println("changed");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("clicked");
		this.setTileSelect(true);
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
}
