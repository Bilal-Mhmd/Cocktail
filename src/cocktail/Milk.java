package cocktail;

public class Milk extends Ingredients {

    private int volume;

    public Milk(String name, int calories, int volume) {
        super(name, calories);
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }
    
    public Color getColor() {
        return new Color(255,255,255);
    }

}