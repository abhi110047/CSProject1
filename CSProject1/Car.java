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
    public int gas;
    public Timer c;
    public int multiplierIncrease;
    private Animation animation;
    private boolean goingLeft = false;
    private int rightFrameNumber = 1;
    
    

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        //setImage("img/car.png");
         MayflowerImage p = new MayflowerImage("img/car.png");

        setImage(p);
        String[] frames = new String[10];
        
    
        
        lane = 1;
        c = new Timer(250000000);
        gas = 100;
    }

    public int getGas(){
        return gas;
    }
    
    
    public int getLane() {
        
        return lane;
    }
    
    public void updateText(){
        
        
    }
    
    public boolean isTouchingMultiplier(){
        if(isTouching(Multiplier.class)) {
            return true;
        }
        return false;
    }
    public void moveRight(){
        
            for(int i = 1; i < 8; i++){
                Timer x = new Timer(1000);
                
                MayflowerImage image = new MayflowerImage("rightTurnA/RightTurn" + i + ".png");
                
                if(x.isDone()){
                   image.scale(0.5);
                   setImage(image); 
                }
                
                
            
            }
            
            
            
            lane+=1;
            setLocation((getLane() - 1) * 82 + 98, 651);
            for(int i = 8; i < 14; i++){
                Timer y = new Timer(1000);
                MayflowerImage image = new MayflowerImage("rightTurnA/RightTurn" + i + ".png");
                if(y.isDone()){
                   image.scale(0.5);
                   setImage(image); 
                }
                
                
                
            
            }
    }
    
    public void act(){
        
        if (Mayflower.isKeyPressed(Keyboard.KEY_RIGHT) && lane < 4){
            
            moveRight();
            
            
            
            
            
        }
        if (Mayflower.isKeyPressed(Keyboard.KEY_LEFT) && lane > 1){
            lane-=1;
            setLocation((getLane() - 1) * 82 + 98, 651);
            
        }
          
        
        if (isTouching(ObstacleCar.class) || isTouching(Extraneous.class)){
            Mayflower.setWorld(new Lose());
        }
        
        
        if(c.isDone()){
            gas -= 1;
            c.reset();
        }
        
        if(gas == 0){
            Mayflower.setWorld(new Lose());
        }
        
        if (isTouching(Gas.class)){
            gas = 100;
        }
        
        
        
        }
    }
