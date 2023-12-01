import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    // Game Sound Initialization
    GreenfootSound sound = new GreenfootSound("sounds/elephantcub.mp3");
    
    // Game Frames Initialization
    GreenfootImage[] idleRight = new GreenfootImage[5];
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    
    // Game Frames Image Index
    int imageIndex = 0;
    
    // Character Facing
    private boolean facingRight = true;
    
    // Frame Timer
    SimpleTimer animationTimer = new SimpleTimer();

    /**
     * Constructor - The code that runs when object is created
     */

    public Snake() {
        // Scale the Snake Images
        // Make Animation to the right
        for(int i = 0; i < idleRight.length; i++) {
            idleRight[i] = new GreenfootImage("images/idle/idle" + i + ".png");
            idleRight[i].scale(75, 75);
        }
        
        // Make Animation to the Left
        for(int i = 0; i < idleLeft.length; i++) {
            idleLeft[i] = new GreenfootImage("images/idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(75, 75);
        }
        
        animationTimer.mark();
        
        // Initial snake image
        setImage(idleRight[0]);
    }

    /**
     * Animate the Snake
     */
    public void animateSnake() {
        // Every 100 ms it will change a frame
        if(animationTimer.millisElapsed() < 100) {
            return;
        }
        // Reset Timer
        animationTimer.mark();
        if (facingRight) {            
            // Set the image to look right
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        } else {
            // Set the image to look left
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            // Move Left
            Log.info(getX());
            move(-2);
            facingRight = false;
        }
        if (Greenfoot.isKeyDown("d")) {
            // Move Right
            Log.info(getX());
            move(2);
            facingRight = true;
        }

        // Remove pizza if snake eats it
        eat();

        // Animate the Snake
        animateSnake();
    }

    /**
     * Checks if the Snake touchs a pizza and eats it if it does
     */
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
