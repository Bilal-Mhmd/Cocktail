package cocktail;

public class Sugar extends Ingredients {

    private int volume;

    private Color color;
    
    public Sugar(){
        super("Sugar", 200);
        this.volume = 0;
        this.color = new Color(255,255,255);
    }
    
    public int getVolume(){
        return 0;
    }
    
    public Color getColor(){
        return new Color(255,255,255);
    }
}