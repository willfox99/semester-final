/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Display;

public class TestChallenge2 {
	

	public static void main(String[] args) {
		
      Display.openWorld("maps/pasture.map");
      Display.setSize(15, 15);
		Display.setSpeed(1);
      Horse will = new Horse();
      will.wander(36, 7);
      will.explode();      
      
      
	}

}
