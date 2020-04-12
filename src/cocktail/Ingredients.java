package cocktail;

public abstract class Ingredients {

    private String name;

    private int calories;

    public Ingredients(String name, int calories) {
        this.name = name;
        this.calories = calories;
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public abstract int getVolume();
    
    public abstract Color getColor();
}