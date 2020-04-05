
package cocktail;

/**
 *
 * @author Bilal
 */

public class Milk extends Ingredients {

    private int volume;

    
    
  public Milk(String name, int calories, int volume, Color color) {
        super(name, calories, color);
        this.volume = volume;
       
    }

   

    public void setVolume(int volume) {
       this.volume =volume;
    }
    
    @Override
     public int getVolume() {
        return this.volume;
    }
    
}
