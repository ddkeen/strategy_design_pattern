
/**
 * A class that gives a string representation of lineman playing offence
 * Implements the OffenceBehavior interface
 * 
 * @author ddkeen
 */
public class OBlockBehavior implements OffenceBehavior{
     /**
     * String representation of what the lineman is doing offensively on this play
     * @return String indicating what the lineman is doing
     */
    public String play(){
        return "blocks defenders";
    }
}
