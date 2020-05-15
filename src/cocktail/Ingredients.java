package cocktail;

/**
 *
 * @author Bilal
 */
import java.io.Serializable;

public abstract class Ingredients implements Serializable {

    private String name;
    private int calories;
    Color color;

    public Ingredients() {
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

    public String getInfo() {
        return "Object name: " + this.name + ", Calories: " + this.calories
                + ", Color: (" + this.getColor().getR() + "," + this.getColor().getG() + ","
                + this.getColor().getB() + ")";

    }

    public abstract int getVolume();
}
