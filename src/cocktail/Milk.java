package cocktail;

/**
 *
 * @author Bilal
 */
public class Milk extends Ingredients {

    private int volume;

    public Milk(int calories, int volume, Color color) {
        super("Milk", calories, color);
        this.volume = volume;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", volume: " + this.getVolume();
    }

}
