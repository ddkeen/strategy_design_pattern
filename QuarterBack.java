

import java.util.Random;
/**
 * Football player object inheriting from the abstract class Player
 * This type of player throws or runs on offence but is not playing on defence
 * @author ddkeen
 */
public class QuarterBack extends Player{
    private Random rand = new Random();
    /**
     * Creates a new QuarterBack with the indicated name
     * @param name the name of the QuarterBack
     */
    public QuarterBack(String name)
    {
        super(name);
    }
     /**
     * Determines the offensice behavior for this QuarterBack for this play, QuarterBacks can run or pass on offence
     */
    public void setOffenceBehavior(){
        if(rand.nextBoolean()) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new RunBehavior();
        }
    }

    /**
     * Set the defensice behavior for this QuarterBack for this play, QuarterBacks do not play on defence
     */
    public void setDefenceBehavior(){
        this.defenceBehavior = null;
    }
}
