import static java.lang.Math.PI;

public class Circle {
    private double radius;
    private double square;

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return square;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.square = (PI*Math.pow(radius, 2));
    }

    public void setSquare(double square) {
        this.square = square;
        this.radius = Math.pow(square/PI, 0.5);
    }

    public String toString(){
        String s = "Radius: " + radius + "\n" + "Square: " + square + "\n";
        return s;
    }
}
