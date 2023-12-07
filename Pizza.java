import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for Snake
 * 
 * @author Ricardo
 * @version December 2023
 */
public class Pizza extends Actor
{
    // Speed of the pizza
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
    
    // Change pizza speed according to the difficulty
    public void setSpeed(int spd) {
        speed = spd;
    }
}
