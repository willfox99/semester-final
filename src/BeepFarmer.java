import org.asl.karelx.Farmer;
import edu.fcps.karel2.Display;


public class BeepFarmer extends Farmer {
	
   public void reap(int width, int height) {
		
     int x = 3;
      int n = 0;
      while(n != height) {
         while(frontIsClear()) {
            while(nextToABeeper()) {
               pickBeeper();
            }
            move();
         }
      n++;
      }
      while(!frontIsClear() && nextToABeeper()) {
         pickBeeper();
      }
      teleport(x+1, 5);
      x++; 
      
	}
	
		public void sow(int width, int height) {
		int startX = this.getX();
		int startY = this.getY();
		for (int i = 0; i< width; i++) {
			for (int j = 0; j<height; j++) {
				teleport(startX+i, startY+j);
				if (this.hasBeepers()) {
					putBeeper();
				}
			}
		}
	}
}
