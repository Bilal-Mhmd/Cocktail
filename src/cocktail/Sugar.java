package cocktail;

/**
 *
 * @author Bilal
 */
public class Sugar extends Ingredients {

    private int volume;

    private Color color;

    public Sugar() {
        super("Sugar", 200, new Color(255, 255, 255));
        this.volume = 0;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", volume: " + this.getVolume();
    }

}
