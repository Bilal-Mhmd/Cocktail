
package cocktail;

/**
 *
 * @author Bilal
 */
public class Sugar extends Ingredients {

    public Sugar( int calories)
    {
    super("Sugar", calories);
    
    }
    
    
    @Override
    public int getVolume() {
        return 0;
    }
    
}
