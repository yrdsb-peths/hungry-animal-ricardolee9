import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemy of Snake
 * 
 * @author Ricardo
 * @version December 2023
 * 
 * The object that causes the snake to die
 */

public class Bomb extends Actor
{
    public void act()
    {
        // Moves 3 Y-points every time
        setLocation(getX(), getY() + 3);
    }
}
