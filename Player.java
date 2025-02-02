

/**
 * Abstract class that is the parent class of all football player objects
 * including Quarterbacks, Receivers, and Lineman
 * 
 * @author ddkeen
 */
public abstract class Player{
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    /**
     * Creates a new Player with the indicated name
     * @param name the name of the Player
     */
    public Player(String name){
        this.name = name;
        this.setOffenceBehavior();
        this.setDefenceBehavior();
    }
    /**
     * Determine what the player will do on defence for a play
     */
    public abstract void setDefenceBehavior();

    /**
     * Determine what the player will do on offence for a play
     */
    public abstract void setOffenceBehavior();

    /**
     * String representation of all players and what they are doing on both offence and defence
     * @return a string containing the players name and what they are doing on the play
     */
    public String play(){
       if (defence)
       {
           if (defenceBehavior == null) return "not playing";
            return defenceBehavior.play();
       } else {
            if (offenceBehavior == null) return "not playing";
            return offenceBehavior.play();
       }
    }

    /**
     * Switches players from offence to defence or from defence to offence
     */
    public void turnover()
    {
        this.defence = !this.defence;
    }
}