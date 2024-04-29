/**
 * Represents a Laser in a 2D space shooter game. This class extends
 * and is used primarily by  objects like the  to attack enemies.
 */

public class Laser extends GameObject {

    /**
     * Constructs a new Laser at the specified coordinates with the given dimensions.
     * The laser is typically narrow and long, meant for precision shooting in the game.
     *
     * @param x The initial horizontal position of the laser.
     * @param y The initial vertical position of the laser.
     * @param width The width of the laser, usually small compared to its height.
     * @param height The height of the laser, emphasizing its elongated shape.
     */

    public Laser(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Provides a string representation of the laser's current position.
     *
     * @return A string that describes the laser's position in the format "Laser at (x,y)".
     */

    public String toString() {
        
        return "Laser at (" + x + "," + y + ")";
    }
}
