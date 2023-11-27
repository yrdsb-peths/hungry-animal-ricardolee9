import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(2);
        }
        
        eat();
    }
    
    private void eat() {
        // Eat the pizza
        if (isTouching(Pizza.class)) {
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnPizza();
            world.increaseScore();
        }
    }
}
