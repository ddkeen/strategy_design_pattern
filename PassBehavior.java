

import java.util.Random;
/**
 * Determines what a Quarterback Object will throw on offence when doing a pass play
 * Implements the OffenceceBehavior interface
 * @author ddkeen
 */
public class PassBehavior implements OffenceBehavior {
    Random rand = new Random();
    private String[] passes = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
    /**
     * Determine what the quarterback is doing on this pass play, there are 5 types of passes
     * @return String indicating what route the quarterback is throwing
     */
    public String play(){
        return "throws a " + passes[rand.nextInt(passes.length)];
    }
    
}
