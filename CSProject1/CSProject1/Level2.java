import mayflower.*;
import java.lang.Math.*;
/**
 * Write a description of class Level1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level2 extends Level
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Level1
     */
    public Level2()
    {
        // initialise instance variables
        
        
        setBackground("img/Level2.png");
        Car driver = new Car();
        addObject(driver, (driver.getLane() - 1) * 82 + 98, 651);
        

        
        buildRaceWorld(.25, .17, .12, .25, .12);
    
        
        
        
    }

    
    public void act()
    {
       
    }
}
