

import java.util.Random;
/**
 * Determines what a Quarterback Object will throw on offence when doing a pass play
 * Implements the OffenceceBehavior interface
 * @author ddkeen
 */
public class PassBehavior implements OffenceBehavior {
    Random rand = new Random();
    /**
     * Determine what the quarterback is doing on this pass play, there are 5 types of passes
     * @return String indicating what route the quarterback is throwing
     */
    public String play()
    {
        int pass = rand.nextInt(5);
        String route;
        if (pass == 0)
        {
            route = "slant route";
        }
        else if (pass == 1)
        {
            route = "out route";
        }
        else if (pass == 2)
        {
            route = "seem route";
        }
        else if (pass == 3)
        {
            route = "screen pass";
        }
        else
        {
            route = "hail mary";
        }
        return "throws a " + route;
    }
    
}
