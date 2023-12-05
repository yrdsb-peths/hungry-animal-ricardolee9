import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Pizza falls downwards
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Call Game Over Function when Pizza is at the bottom of the world
        if (getY() > getWorld().getHeight()) {
            GameOverWorld gameOverWorld = new GameOverWorld();
            Greenfoot.setWorld(gameOverWorld);
            getWorld().removeObject(this);
        }
    }
    
    public void setSpeed(int spd) {
        speed = spd;
    }
}
