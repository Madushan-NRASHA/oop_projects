package mypackage;

public class Rectangle {
    public double length; // instance variable
    public double width; // instance variable
    public static int count;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        count++;
    }
    public Rectangle(){ //para constructer
        this.length=5;
        this.width=2;
        count++;
    }
    
    public double getArea(){ //to calculate area
        return length*width;
    }
    public double perimeter(){ // to calculate perimeter

        return 2*(length+width);
    }
}
