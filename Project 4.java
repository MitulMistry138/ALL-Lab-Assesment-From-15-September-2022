public abstract class Shape {
    public abstract void RectangleArea(double lenght, double width);
    public abstract void SquareArea(double side);
    public abstract void CircleArea(double radius);
}

//---------- Area.java ----------
import static java.lang.Math.*;

public class Area extends Shape{

    @Override
    public void RectangleArea(double lenght, double width) {
        System.out.printf("Rectangle area = %.2f", lenght*width);
        System.out.println("");
    }

    @Override
    public void SquareArea(double side) {
        System.out.printf("Square area = %.2f", pow(side,2));
        System.out.println("");
    }

    @Override
    public void CircleArea(double radius) {
        System.out.printf("Circle area = %.2f", PI*pow(radius, 2));
        System.out.println("");
    }
}

//---------- Main.java ----------
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Area area = new Area();
        Scanner in = new Scanner(System.in);

        System.out.print("Entrer length for rectangle: ");
        double len = in.nextDouble();
        System.out.print("Entrer breadth for rectangle: ");
        double bre = in.nextDouble();
        area.RectangleArea(len, bre);

        System.out.print("Entrer breadth for square: ");
        double sid = in.nextDouble();
        area.SquareArea(sid);

        System.out.print("Entrer breadth for circle: ");
        double rad = in.nextDouble();
        area.CircleArea(rad);
    }
}