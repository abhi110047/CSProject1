import mayflower.*;
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    // instance variables - replace the example below with your own
    private int x;
    private int lane;

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        setImage("img/car.png");
        lane = 1;
    }

    
    public int getLane() {
        
        return lane;
    }
    
    public void updateText(){
        
        
    }
    
    
    public void act(){
        
        if (Mayflower.isKeyPressed(Keyboard.KEY_RIGHT) && lane < 4){
            lane+=1;
            setLocation((getLane() - 1) * 82 + 98, 651);
            
            for(int i = 0
        }
        if (Mayflower.isKeyPressed(Keyboard.KEY_LEFT) && lane > 1){
            lane-=1;
            setLocation((getLane() - 1) * 82 + 98, 651);
            
        }
          
        
        if (isTouching(ObstacleCar.class) || isTouching(Extraneous.class)){
            Mayflower.setWorld(new Lose());
        }
        
        
        }
    }
