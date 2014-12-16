import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Display;


public class Horse extends Wanderer {

	public Horse (){
   super (6,5);
   }
	
	/**
	 * 
	 * @parameter count		the total number of steps to take
	 * @parameter timer		the interval at which to drop a beeper
	 * 
	 *  horse.wander(13, 4) 
    * should drop a beeper every four steps until thirteen steps are taken
	 */
    
    
    
	public void wander(int count, int timer) {
		int timer2 = timer;
      int num = 0;
      while(count != 0) {
         wander();         
         count = count -1;
         num = num + 1;
         if(num == timer2) {
            putBeeper();
            timer2 = timer2 + timer;
         }
      }
	}
}
