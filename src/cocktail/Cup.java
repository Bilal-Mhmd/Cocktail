
package cocktail;

/**
 *
 * @author Bilal
 */
public class Cup  {

  
    private int capacity;
    private int volume;

    private int calories;

    public Cup(int capacity) {
        this.capacity = capacity;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
}
