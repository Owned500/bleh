import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rocket is a rocket that can be controlled by the arrow keys and
 * shoot Projectile objects.
 * 
 * @author (your name) 
 * @version 1.0
 */
public class Rocket extends Actor
{
    // references to other objects that our rocket needs to use
    private HealthBar healthbar;
    private Asteroid lastAsteroidHit;
    
    /**
     * Since our rocket is controlled by the arrow keys, the only thing that we need
     * to do in the act method is check on which keys are pressed.
     */
    public void act() 
    {
        checkKeys();
        checkFireKey();
        checkForAsteroid();
    }
    
    /**
     * checkKeys checks the keyboard keys and moves the rocket accordingly.
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("up"))
        {
           move(10); 
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-10);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(10);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-10);
        }
    }
    
    /**
     * This method checks if the fire key is pressed. If the fire key is pressed,
     * it will call the fireProjectile() method.
     */
    public void checkFireKey()
    {
        if ("space".equals(Greenfoot.getKey()) ) {
			fireProjectile();
		}
    }
    
    /**
     * Check if we're hitting an asteroid.
     */
    public void checkForAsteroid()
    {
        Asteroid asteroid = (Asteroid) getOneObjectAtOffset(10, 10, Asteroid.class);
        if ( asteroid != null ) {
            subtractHealth();
        }
        if ( asteroid != null)
        {
            move(-6);
        }
    }

    /**
     * This method creates a new Projectile object, and fires it in the direction
     * that this rocket is pointing in.
     */
    public void fireProjectile()
    {
        Projectile proj = new Projectile();
        getWorld().addObject(proj, getX(), getY());
        proj.setRotation(getRotation());
        proj.move(40);
    }
    
    /**
     * This method calls our health bar's subtractHealth() method.
     */
    public void subtractHealth()
    {
        healthbar.subtractHealth(1);
    }
    
    /**
     * This is a "setter". It is a method that takes one input - a reference to a
     * HealthBar object - and sets our local reference to that object. 
     */
    public void setHealthBar(HealthBar hb)
    {
        healthbar = hb;
    }
}
