public class Square extends Rectangle {

    double side=super.getLength();

    public Square(){
     super.setLength(1.0);
    }
    public Square(double side) {
        super.getLength();
    }
    public Square(double width, double length,String color, boolean filled) {
       super();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(double length, double width) {
        return length*length;
    }

    @Override
    public double getPerimeter(double length, double width) {
        return length*4;
    }

    @Override
    public String toString() {
        return " A Square with side = " + side +  " which is a subclass of" + super.toString();
    }
}
