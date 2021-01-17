

import java.util.Random;
/**
 * Football player object inheriting fromthe abstract class Player
 * This type of player blocks defenders on offence and blocks various plays on defence
 * @author ddkeen
 */
public class Lineman extends Player {

    Random rand = new Random();

    /**
     * Creates a new Lineman with the indicated name
     * @param name the name of the Lineman
     */
    public Lineman(String name){
        super(name);
    }
    /**
     * Determines the offensice behavior for this lineman for this play, lineman can only block on offence
     */
    public void setOffenceBehavior(){
        this.offenceBehavior = new OBlockBehavior();
    }
    /**
     * Determines the defencive behavior for this lineman for this play, lineman can block, defend, strip, or sack
     */
    public void setDefenceBehavior(){
        int defend = rand.nextInt(3);
        if (defend == 0)
        {
            this.defenceBehavior = new BlockBehavior();
        }
        else if (defend == 1)
        {
            this.defenceBehavior = new StripBehavior();
        }
        else
        {
            this.defenceBehavior = new SackBehavior();
        }
    }
}
