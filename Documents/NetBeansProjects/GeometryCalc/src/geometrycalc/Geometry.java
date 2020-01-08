package geometrycalc;

public class Geometry {

    //varibles for area, radius, length, width. 
    private static double area;
    private static double radius;
    private static double Length;
    private static double Width;

    // circle set method which recieves an argument and calculates it in the formula.
    public static void Circle(double rad) {
        radius = rad;
        area = Math.PI * radius * radius;

    }

    // rectangle set method which recieves two arguments and calculates it in the formula.
    public static void Rectangle(double l, double w) {
        Length = l;
        Width = w;
        area = Length * Width;
    }

    // area method that return the calculations back to the main method for display.
    public static double Area() {
        return area;
    }
}
