import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class CarBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarBrick extends Brick
{
    int direction = 2;
    /**
     * Act - do whatever the CarBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1); 
        if (atWorldEdge() )
        {
            direction = direction * -1;
        }
        super.act();
    }
    public  void CarBrick()
    {
        GreenfootImage image = new GreenfootImage(40, 20);
        image.setColor(Color.red);
        image.fillRect(0, 0, 40, 20);
        image.setColor(Color.black);
        setImage(image);
    }
    public boolean atWorldEdge()
    {
        if (getX() > getWorld().getWidth() - 5)
        {
            return true;
        }
        if (getX() < 10 )
        {
            return true;
        }
        return false;
    }
}
