

/**
 * Class returning what a lineman is sacking on defence Implements the
 * DefenceBehavior interface
 * 
 * @author ddkeen
 */
public class SackBehavior implements DefenceBehavior{
    /**
     * String representation of  what the lineman is doing defensively on this play when commit a sack
     * @return String indicating a sack
     */
    public String play() {
        return "sacks the Quarterback";
    }
    
}
