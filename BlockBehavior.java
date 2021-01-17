import java.util.Random;
/**
 * Determines what a Lineman Object will block on defence
 * Implements the DefenceBehavior interface
 * @author ddkeen
 */
public class BlockBehavior implements DefenceBehavior{
    Random rand = new Random();
    /**
     * Determine what the lineman is doing defensively on this play, there are 4 things a lineman can block
     * @return String indicating what the defender is blocking
     */
    public String play(){
    int block = rand.nextInt(4);
    String ball;
    if (block == 0)
    {
        ball = "kick";
    }
    else if(block ==1)
    {
        ball = "punt";
    }
    else if (block==2)
    {
        ball = "pass";
    }
    else
    {
        ball = "catch";
    }
    return "blocks a " + ball;
    }
}
