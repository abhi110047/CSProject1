import mayflower.*;
public class Lose extends Level
{
   
    public Lose()
    {
        setBackground("img/Lose.png");
        Mayflower.showBounds(true);
    }

    public void act(){
        if(Mayflower.isKeyPressed(Keyboard.KEY_ENTER)){
            score = 0;
            Mayflower.setWorld(new Level1());
        }
        
        if(Mayflower.isKeyDown(Keyboard.KEY_A)){
            score = 0;
            System.exit(0);
        }
    }
}
