public class Square extends Rectangle {
    protected double side;
    public Square() {
        this.filled = false;
        this.color = "red";
        side = 5;
    }

    public Square(double side) {
        this.filled = false;
        this.color = "red";
        this.side=side;
    }

    public Square(double side, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.side=side;
    }

    public double getSide() {

        return side;
    }

    public void setSide(double side) {

        this.side = side;
    }
    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return  4*side;
    }

    @Override
    public String toString() {
        return "Shape: square, side = " + this.side + ", color: " + this.color;
    }

}
