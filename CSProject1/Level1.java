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
    private int x;
    public Object[][] objects;
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
        
        objects = new Object[32][4];
        
        for (int r = 0; r < objects.length; r++) {
            for (int c = 0; c < objects[r].length; c++) {
                double rng = Math.random();
                
                if (rng < 0.15) {
                    objects[r][c] = new ObstacleCar();
                }
                else if (rng < 0.2) {
                    objects[r][c] = new Multiplier();
                }
                else if (rng < 0.22){
                    objects[r][c]= new SpeedBoost();
                }
                else if (rng < 0.25){
                    objects[r][c] = new Extraneous();
                }
                else if (rng < 0.27) {
                    objects[r][c] = new Gas();
                }
            }
        }
        
        
    }

    
    
    public void act()
    {
       
    }
}
