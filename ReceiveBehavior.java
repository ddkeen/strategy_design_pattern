

import java.util.Random;
/**
 * A class that gives a string representation of receivers playing offence
 * Implements the OffenceBehavior interface
 * @author ddkeen
 */
public class ReceiveBehavior implements OffenceBehavior {
    Random rand = new Random();
    /**
     * Determine what the receiver is doing offensively on this play, they can run 5 differnet routes
     * @return String indicating the route the receiver is running
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
        return "runs a " + route;
    }
    
}
