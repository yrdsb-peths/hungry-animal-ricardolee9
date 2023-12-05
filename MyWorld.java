import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int score = 0;
    private Label scoreLabel;
    int level = 1;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // Create a world that has no boundaries
        super(600, 400, 1, false);
        
        // Create the Animal
        Snake snake = new Snake();
        addObject(snake, 300, 300);
        
        // Spawn the food for the animal
        spawnPizza();
        
        // Score Label Initialization
        scoreLabel = new Label(0, 70);
        addObject(scoreLabel, 50, 50);
    }
    
    // Increases the Score
    public void increaseScore() {
        score += 1;
        scoreLabel.setValue(score);
        
        if (score % 5 == 0) {
            level += 1;
        }
    }
    
    // Spawn a new pizza
    public void spawnPizza() {
        Pizza pizza = new Pizza();
        pizza.setSpeed(level);
        addObject(pizza, Greenfoot.getRandomNumber(600), 0);
        Bomb bomb = new Bomb();
        addObject(bomb, Greenfoot.getRandomNumber(600), 0);
    }
}
