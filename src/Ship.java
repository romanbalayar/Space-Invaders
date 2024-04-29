/**
 * Represents a Ship in a 2D space shooter game. This class extends 
 * and implements the interface specifically for firing projectiles.
 */


public class Ship extends GameObject implements Shooter<Laser> {
    /**
     * Constructs a new Ship at the specified coordinates with the given dimensions.
     *
     * @param x The initial horizontal position of the ship.
     * @param y The initial vertical position of the ship.
     * @param width The width of the ship.
     * @param height The height of the ship.
     */


    public Ship(int x, int y, int width, int height) {
        super(x, y, width, height);
    }


    /**
     * Fires a laser from the ship.
     *  The laser is created at the center of the ship and just above it.
     * @return A new object representing the laser fired by the ship.
     */


    @Override
    public Laser fire() {
        int laserX = x + width / 2 - GameData.LASER_WIDTH / 2;
        int laserY = y - GameData.LASER_HEIGHT;
        return new Laser(laserX, laserY, GameData.LASER_WIDTH, GameData.LASER_HEIGHT);
    }


    /**
     * Provides a string representation of the ship's current position.
     *
     * @return A string that describes the ship's position in the format "Ship at (x,y)".
     */

     
    public String toString() {
        return "Ship at (" + x + "," + y + ")";
    }
}
