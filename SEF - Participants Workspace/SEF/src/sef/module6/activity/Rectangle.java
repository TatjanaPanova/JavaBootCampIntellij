package sef.module6.activity;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public double getLength() {
        return this.length;
    }

    public double calculateArea() {
        double result = this.length * this.breadth;
        return result;
    }

    public double calculatePerimeter() {
        double result = 2 * (this.length + this.breadth);
        return result;
    }

    /*    public abstract double calculateArea(length * breadth){
        return double;
    }

    public abstract double calculatePerimeter(2 * (length + breadth)){
        return double ;
    }
*/
}
