

import java.util.Random;
/**
 * A class that gives a string representation of quarterbacks playing offence when they run
 * Implements the OffenceBehavior interface
 * @author ddkeen
 */
public class RunBehavior implements OffenceBehavior {

    Random rand = new Random();
    private String[] runs = {"drive (up the gut)", "draw", "pitch", "reverse"};

    /**
     * Determine what the quarterback is running offensively on this play during a run, there are 4 types of runs
     * @return String indicating the type of run the quarterback is running
     */
    public String play() {
        return "runs a " + runs[rand.nextInt(runs.length)];
    }
    
}
