public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length,String color, boolean filled) {
        super(color, filled);
        this.width=width;
        this.length=length;
    }


    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }
    public Rectangle() {
        this.width=1.0;
        this.length=1.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(double length , double width){
        return length*width ;
    }

    public double getPerimeter(double length , double width){
        double result ;
        result = 2*(length+width);
        return result;
    }

    @Override
    public String toString() {
        return " A Rectangle with Width = " + width + " and Length = " + length + " which is subclass of" + super.toString();
    }
}


