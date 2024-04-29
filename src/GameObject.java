import java.awt.*;

/**
 * Represents an abstract base class for all game objects in a 2D game. 
 * This class provides basic properties like position and dimensions, 
 * and implements the interface to handle geometric operations such as
 * bounding box calculations and intersection tests.
 *@author Roman Balayar
 *@CS251-lab9
 */

public abstract class GameObject implements Object2D {

    /**
     * X -> Horizontal position of the game object
     * Y -> Vertical position of the game object
     * Width of the game object
     * Height of the game object
     */

    protected int x, y, width, height;

    /**
     * Constructs a new GameObject positioned at specified
     *  coordinates with given dimensions.
     * @param x The initial horizontal position of the game object.
     * @param y The initial vertical position of the game object.
     * @param width The width of the game object.
     * @param height The height of the game object.
     */

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

   /**
     * Returns the x-coordinate of the game object.
     *
     * @return The x-coordinate.
     */

    @Override
    public int getX() { return x; }

    /**
     * Returns the y-coordinate of the game object.
     *
     * @return The y-coordinate.
     */


    @Override
    public int getY() { return y; }

    /**
     * Returns the width of the game object.
     *
     * @return The width.
     */

    @Override
    public int getWidth() { return width; }

    /**
     * Returns the height of the game object.
     *
     * @return The height.
     */

    @Override
    public int getHeight() { return height; }

    /**
     * Computes and returns the bounding rectangle of the game object.
     *
     * @return The bounding rectangle.
     */

    @Override
    public Rectangle getBoundingRectangle() {
        return new Rectangle(x, y, width, height);
    }

    /**
     * Checks whether this game object intersects with another game object.
     *
     * @param other Another object to check intersection with.
     * @return true if there is an intersection; false otherwise.
     */

    @Override
    public boolean intersects(Object2D other) {
        Rectangle thisRect = getBoundingRectangle();
        Rectangle otherRect = other.getBoundingRectangle();
        return thisRect.intersects(otherRect);
    }

    /**
     * Checks whether this game object is out of the predefined game board bounds.
     *
     * @return true if the object is out of bounds; false otherwise.
     */

    @Override
    public boolean isOutOfBounds() {
        return x < 0 || y < 0 || x + width > GameData.GAME_BOARD_WIDTH ||
                y + height > GameData.GAME_BOARD_HEIGHT;
    }
}