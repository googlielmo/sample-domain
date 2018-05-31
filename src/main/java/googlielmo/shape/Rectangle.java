package googlielmo.shape;

/**
 *
 */
public class Rectangle extends Shape {

    double width, height;

    public Rectangle() {
        width = 0.0;
        height = 0.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + width + "," + height + "]";
    }
}
