import mayflower.*;
import java.lang.Math.*;
/**
 * Write a description of class Level1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level3 extends Level
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Level1
     */
    public Level3()
    {
        // initialise instance variables
        
        
        setBackground("img/FuturisticCity.png");
        Car driver = new Car();
        addObject(driver, (driver.getLane() - 1) * 82 + 98, 651);
        

        
        buildRaceWorld(2, .35, .27, .22, .35, .22);
    
        
        
        
    }

    
    public void act()
    {
       
    }
}
