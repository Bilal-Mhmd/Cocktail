package cocktail;

/**
 *
 * @author Bilal
 */
public class ColorOutOfRangeException extends Exception {

    public ColorOutOfRangeException() {
        super("color should be in the range 0-255");
    }

}
