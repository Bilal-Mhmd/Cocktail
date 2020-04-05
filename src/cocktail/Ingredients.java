
package cocktail;

/**
 *
 * @author Bilal
 */
public abstract class Ingredients {

     private String name;
     private int calories;
     Color color;

    public  Ingredients(String name, int calories) {
        this.name = name;
        this.calories = calories;
        
    }

    public Ingredients(String name, int calories, Color color) {
        this.name = name;
        this.calories = calories;
        this.color = color;
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

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
    
    public abstract int getVolume();
}