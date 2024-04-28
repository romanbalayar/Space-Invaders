import java.awt.*;

public abstract class GameObject implements Object2D {
    protected int x, y, width, height;

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }

    @Override
    public int getWidth() { return width; }

    @Override
    public int getHeight() { return height; }

    @Override
    public Rectangle getBoundingRectangle() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public boolean intersects(Object2D other) {
        Rectangle thisRect = getBoundingRectangle();
        Rectangle otherRect = other.getBoundingRectangle();
        return thisRect.intersects(otherRect);
    }

    @Override
    public boolean isOutOfBounds() {
        // Assuming the game board is 300x200 as per GameData
        return x < 0 || y < 0 || x + width > GameData.GAME_BOARD_WIDTH ||
                y + height > GameData.GAME_BOARD_HEIGHT;
    }
}
