

import java.util.Random;
/**
 * A class that gives a string representation of quarterbacks playing offence when they run
 * Implements the OffenceBehavior interface
 * @author ddkeen
 */
public class RunBehavior implements OffenceBehavior {

    Random rand = new Random();
    /**
     * Determine what the quarterback is running offensively on this play during a run, there are 4 types of runs
     * @return String indicating the type of run the quarterback is running
     */
    public String play(){
    int run = rand.nextInt(4);
    String route;
    if (run == 0)
    {
        route = "drive up the gut";
    }
    else if(run ==1)
    {
        route = "draw";
    }
    else if (run==2)
    {
        route = "pitch";
    }
    else
    {
        route = "reverse";
    }
        return "runs a " + route;
    }
    
}
