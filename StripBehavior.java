

/**
 * Class returning what a lineman is sacking on defence Implements the
 * DefenceBehavior interface
 * 
 * @author ddkeen
 */
public class StripBehavior implements DefenceBehavior {
    /**
     * String representation of  what the lineman is doing defensively on this play when doing a strop
     * @return String indicating a strip
     */
    public String play(){
        return "strips a ball from runner's hands";
    }
    
}
