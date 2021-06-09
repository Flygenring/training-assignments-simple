package eu.sig.training.ch05.boardpanel;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
    /**
     * Renders a single square on its given graphics context on the specified
     * rectangle.
     * 
     * @param square
     *            The square to render.
     * @param origin
     *            The x and y position to start drawing.
     * @param size
     *            The width and height of this square (in pixels).
     */
    private void render(Square square, Point origin, Dimension size) {
        square.getSprite().draw(origin, size);

        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(origin, size);
        }
    }

    private class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private class Dimension {
        int width;
        int height;

        public Dimension(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    /**
     * @param graphics
     *            The graphics context to draw on.
    */
    private class Sprite {
        Graphics graphics;

        public Sprite(graphics) {
            this.graphics = graphics;
        }

        public void draw(Point origin, Dimension size) {

        }
    }

    private class Unit {
        Sprite sprite;

        public Unit(sprite) {
            this.sprite = sprite;
        }

        public Sprite getSprite() {
            return sprite;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return new List<Unit>();
        }
    }
}
