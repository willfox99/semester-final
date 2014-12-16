import org.asl.karelx.Squarebot;
import edu.fcps.karel2.Display; 
import edu.fcps.karel2.Robot;
 
public class TestChallenge1 {
	
     

	public static void main(String[] args) {
   
		Display.setSize(10, 10);
		Display.setSpeed(8);
      Squarebot will = new Squarebot(9, 3);
      will.layCorners(5);
      Sentry matt = new Sentry(4, 4);
      matt.patrol();	
      
   }

}

