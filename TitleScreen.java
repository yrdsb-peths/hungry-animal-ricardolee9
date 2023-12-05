import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Ricardo
 * @version December 2023
 */
public class TitleScreen extends World
{
    // Holds the title of the game
    Label titleLabel = new Label("Hungry Snake", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 200, 100);
        prepare();
    }

    /**
     * Loop the main world act
     */
    public void act() {
        // Start the game if spacebar is pressed
        if (Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snake snake = new Snake();
        addObject(snake,403,100);
        Pizza pizza = new Pizza();
        addObject(pizza,537,110);
        pizza.setLocation(456,51);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,499,108);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,558,60);
        Label label = new Label("Press \u02C2 space \u02C3 to start playing", 60);
        addObject(label,188,254);
        label.setLocation(304,217);
        label.setLocation(379,205);
        label.setLocation(316,194);
        removeObject(label);
        Label label2 = new Label("Press \u02C2 space \u02C3 to play", 45);
        addObject(label2,114,220);
        label2.setLocation(332,229);
        Label label3 = new Label("Use <a> & <d> to move left and right", 40);
        addObject(label3,127,307);
        label3.setLocation(312,312);
        label2.setLocation(302,227);
    }
}
