import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 1);
        
        // Call Game Over Function when Pizza is at the bottom of the world
        if (getY() > getWorld().getHeight()) {
            GameOverWorld gameOverWorld = new GameOverWorld();
            Greenfoot.setWorld(gameOverWorld);
            getWorld().removeObject(this);
        }
    }
}
