public class Alien extends GameObject implements Shooter<Missile> {
    public Alien(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public Missile fire() {
        // Missile is centered below the alien
        int missileX = x + width / 2 - GameData.MISSILE_WIDTH / 2;
        int missileY = y + height;
        return new Missile(missileX, missileY, GameData.MISSILE_WIDTH, GameData.MISSILE_HEIGHT);
    }
}
