package cocktail;

public class Fruits extends Ingredients {

    private int volume;

    private Color color;

    public Fruits(String name, int calories, int volume, Color color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

 
    public int getVolume() {
        return this.volume;
    }

    public Color getColor() {
        return this.color;
    }

   
}