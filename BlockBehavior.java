import java.util.Random;
/**
 * Determines what a Lineman Object will block on defence
 * Implements the DefenceBehavior interface
 * @author ddkeen
 */
public class BlockBehavior implements DefenceBehavior{
    Random rand = new Random();
    private String[] blocks = {"kick", "punt", "pass", "catch"};
    /**
     * Determine what the lineman is doing defensively on this play, there are 4 things a lineman can block
     * @return String indicating what the defender is blocking
     */
    public String play(){
    
    return "blocks a " + blocks[rand.nextInt(blocks.length)];
    }
}
