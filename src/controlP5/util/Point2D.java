package controlP5.util;

import static processing.core.PApplet.sq;
import static processing.core.PApplet.sqrt;

public class Point2D {
    public float x = 0f;
    public float y = 0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(float theX, float theY) {
        x = theX;
        y = theY;
    }

    public Point2D clone() {
        return new Point2D(x, y);
    }

    public Point2D add(Point2D other) {
        return new Point2D(x + other.x, y + other.y);
    }

    public Point2D add(float dx, float dy) {
        return new Point2D(x + dx, y + dy);
    }

    public Point2D subtract(Point2D other) {
        return new Point2D(x - other.x, y - other.y);
    }

    public void setTo(Point2D other) {
        x = other.x;
        y = other.y;
    }

    public Point2D quantised(int amount) {
        return new Point2D((int) (x / amount) * amount, (int) (y / amount) * amount);
    }

    public String toString() {
        return "x : " + x + ", y : " + y;
    }

    public float distance(Point2D other) {
        return sqrt(sq(other.x - x) + sq(other.y - y));
    }
}
