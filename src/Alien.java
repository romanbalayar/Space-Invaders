/**
 * Represents an Alien in a 2D space shooter game. This class extends 
 * and implements the  interface specifically for firing  projectiles.
 */


public class Alien extends GameObject implements Shooter<Missile> {

    /**
     * Constructs a new Alien at the specified coordinates with the given dimensions.
     *
     * @param x The initial horizontal position of the alien.
     * @param y The initial vertical position of the alien.
     * @param width The width of the alien.
     * @param height The height of the alien.
     */


    public Alien(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Fires a missile from the alien. The missile is launched 
     * directly below the alien, centered horizontally.
     *
     * @return A new {@link Missile} object representing the missile fired by the alien.
     */

    @Override
    public Missile fire() {
        int missileX = x + width / 2 - GameData.MISSILE_WIDTH / 2;
        int missileY = y + height;
        return new Missile(missileX, missileY, GameData.MISSILE_WIDTH, GameData.MISSILE_HEIGHT);
    }

    /**
     * Provides a string representation of the alien's current position.
     *
     * @return A string that describes the alien's position in the format "Alien at (x,y)".
     */
    
    public String toString() {
        return "Alien at (" + x + "," + y + ")";
    }
}
