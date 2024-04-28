public class Ship extends GameObject implements Shooter<Laser> {
    public Ship(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public Laser fire() {
        // Laser is centered horizontally above the ship
        int laserX = x + width / 2 - GameData.LASER_WIDTH / 2;
        int laserY = y - GameData.LASER_HEIGHT;
        return new Laser(laserX, laserY, GameData.LASER_WIDTH, GameData.LASER_HEIGHT);
    }
}
