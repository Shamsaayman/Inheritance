//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {
Shape test = new Shape();
System.out.println(test.toString());
Circle c= new Circle();
System.out.println(c.toString());
System.out.println("Area of Circle "+ c.getPerimeter(4.5));
System.out.println("Perimeter of Circle "+ c.getPerimeter(2.5));
Rectangle r = new Rectangle();
System.out.println(r.toString());
System.out.println("Area of Rectangle "+ r.getPerimeter(4,2));
System.out.println("Perimeter of Rectangle "+ r.getPerimeter(2,2));
Square s = new Square();
System.out.println(s.toString());
System.out.println("Area of Square "+ s.getPerimeter(4,2));
System.out.println("Perimeter of Square "+ s.getPerimeter(2,2));

    }
}