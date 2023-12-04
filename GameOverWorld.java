import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOverWorld extends World
{

    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Label gameOverLabel = new Label("Game Over", 80);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
    }
}
