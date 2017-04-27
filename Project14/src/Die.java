import java.util.Random;

public class Die {

    private int numberOfSides;
    private int currentValue;
    private Random randomizer;
    
    public static final int DEFAULT_NUMBER_OF_SIDES = 6;
    
    public Die(int newNumberOfSides){
        this.setCurrentValue(0);
        this.setNumberOfSides(newNumberOfSides);
        this.setRandomizer(new Random());
    }
    
    public Die(){
        this(Die.DEFAULT_NUMBER_OF_SIDES);
    }
    
    public int roll() {
        this.setCurrentValue(this.getRandomizer().nextInt(this.getNumberOfSides()) +1) ;
        return this.getCurrentValue();
    }
    
    
    public int getCurrentValue(){
        return this.currentValue;
    }
    
    private void setCurrentValue(int newCurrentValue){
        this.currentValue = newCurrentValue;
    }
    
    public int getNumberOfSides(){
        return this.numberOfSides;
    }

    private void setNumberOfSides(int newNumberOfSides){
        this.numberOfSides = newNumberOfSides;
    }
    
    private Random getRandomizer(){
        return this.randomizer;
    }
    
    private void setRandomizer(Random newRandomizer){
        this.randomizer = newRandomizer;
    }
}

