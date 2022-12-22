
import java.math.*;
abstract class Shape{
    protected String color;
    protected boolean filled;
    public Shape(){
        color = "red";
        filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {

        this.filled = filled;
    }
    public String toString() {
        return super.toString();
    }

    protected double getArea() {
        return 0;
    }

    protected double getPerimeter() {
        return 0;
    }


}

