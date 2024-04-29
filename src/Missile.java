/**
 * Represents a Missile in a 2D space shooter game. This class extends
 * and is used primarily by  objects like the to attack or defend.
 */


public class Missile extends GameObject {

    /**
     * Constructs a new Missile at the specified coordinates with the given dimensions.
     *
     * @param x The initial horizontal position of the missile.
     * @param y The initial vertical position of the missile.
     * @param width The width of the missile.
     * @param height The height of the missile.
     */

    public Missile(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Provides a string representation of the missile's current position.
     *
     * @return A string that describes the missile's position in the format "Missile at (x,y)".
     */
    
    public String toString() {
        return "Missile at (" + x + "," + y + ")";
    }
}
