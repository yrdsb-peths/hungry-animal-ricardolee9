import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int score = 0;
    private Label scoreLabel;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Snake snake = new Snake();
        addObject(snake, 300, 300);
        spawnPizza();
        
        scoreLabel = new Label(0, 70);
        addObject(scoreLabel, 50, 50);
    }
    
    public void increaseScore() {
        score += 1;
        scoreLabel.setValue(score);
    }
    
    public void spawnPizza() {
        Pizza pizza = new Pizza();
        addObject(pizza, Greenfoot.getRandomNumber(600), 0);
    }
}
