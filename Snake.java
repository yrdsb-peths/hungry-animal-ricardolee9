import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    public Snake() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            Log.info("Elephant moves left");
            move(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            Log.info("Elephant moves right");
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
