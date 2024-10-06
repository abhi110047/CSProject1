import mayflower.*;
import java.lang.Math.*;
/**
 * Write a description of class Level1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Level1
     */
    public Level1()
    {
        // initialise instance variables
        
        
        setBackground("img/RacingBackground.png");
        Car driver = new Car();
        addObject(driver, (driver.getLane() - 1) * 82 + 98, 651);
        

        
        buildRaceWorld(.15, .07, .02, .15, .02);
    
        
        
        
    }

    
    public void act()
    {
       
    }
}
