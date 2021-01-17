

/**
 * Football player object inheriting from the abstract class Player This type of
 * player runs a route on offence but is not playing on defence
 * 
 * @author ddkeen
 */
public class Receiver extends Player {
    /**
     * Creates a new Receiver with the indicated name
     * @param name the name of the Receiver
     */
    public Receiver(String name){
        super(name);
    }
    /**
     * Sets the offensice behavior for this Receiver for this play, Receivers only run routes on offence
     */
    public void setOffenceBehavior(){
        this.offenceBehavior = new ReceiveBehavior();
    }
    /**
     * Sets the defencive behavior for this Receiver for this play, Receivers do not play defence
     */
    public void setDefenceBehavior(){
        this.defenceBehavior = null;
    }
}
