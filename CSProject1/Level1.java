import mayflower.*;
/**
 * Write a description of class Level1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Level1
     */
    public Level1()
    {
        // initialise instance variables
        setBackground("img/RacingBackground.png");
        Car driver = new Car();
        addObject(driver, driver.getLane() * 70 - 60, 700);
    }

    
    public void act()
    {
       
    }
}
