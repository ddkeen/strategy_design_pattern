

import java.util.Random;
/**
 * A class that gives a string representation of receivers playing offence
 * Implements the OffenceBehavior interface
 * @author ddkeen
 */
public class ReceiveBehavior implements OffenceBehavior {
    Random rand = new Random();
    private String[] passes = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
    /**
     * Determine what the receiver is doing offensively on this play, they can run 5 differnet routes
     * @return String indicating the route the receiver is running
     */
    public String play() {
        return "runs a " + passes[rand.nextInt(passes.length)];
    }
    
}
