import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Something the snake will die if it eats
 */
public class Bomb extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() + 3);
    }
}
