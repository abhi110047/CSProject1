import mayflower.*;
import Math.*;
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
    public String[][] objects;
    /**
     * Constructor for objects of class Level1
     */
    public Level1()
    {
        // initialise instance variables
        
        setBackground("img/RacingBackground.png");
        Car driver = new Car();
        addObject(driver, (driver.getLane() - 1) * 97 + 11, 700);
        
        showText("Lane = " + driver.getLane(), 10, 30, Color.BLACK);
        
        objects = new String[32][4];
        
        for (int r = 0; r < objects.length; r++) {
            for (int c = 0; c < objects[r].length; c++) {
                double rng = Math.random();
                
                if (rng < 0.15) {
                    objects[r][c] = "car";
                }
                else if (rng < 0.2) {
                    objects[r][c] = "multiplier";
                }
            }
        }
    }

    
    public void act()
    {
       
    }
}
