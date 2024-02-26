public class Circle extends Shape{
    private double radius ;

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }

    public Circle(){
        this.radius=1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double r){
        double result ;
        result = 3.14*r*r;
        return result;
    }

    public double getPerimeter(double r){
        double result ;
        result = 3.14*2*r;
        return result;
    }

    @Override
    public String toString() {
        return " A Circle with radius " + radius + " which is a subclass of" + super.toString();
    }
}
