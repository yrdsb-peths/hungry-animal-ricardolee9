import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    GreenfootSound sound = new GreenfootSound("./sounds/elephantcub.mp3");
    public Snake() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            Log.info(getX());
            move(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            Log.info(getX());
            move(2);
        }
        
        eat();
    }
    
    private void eat() {
        // Eat the pizza
        if (isTouching(Pizza.class)) {
            removeTouching(Pizza.class);
            sound.play();
            MyWorld world = (MyWorld) getWorld();
            world.spawnPizza();
            world.increaseScore();
        }
    }
}
