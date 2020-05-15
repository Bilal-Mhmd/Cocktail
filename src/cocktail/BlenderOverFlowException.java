package cocktail;

/**
 *
 * @author Bilal
 */
class BlenderOverFlowException extends Exception {

    public BlenderOverFlowException() {
        super("Ingredients volume exceeds blender capacity");
    }

}
