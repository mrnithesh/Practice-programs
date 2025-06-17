//OOP PRACTICE - ABSTRACTION

abstract class Shape{
    abstract double getArea(); 
}
class Square extends Shape{
    double side;
     
    Square(double side){
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Square s = new Square(50.0);
        System.out.println(s.getArea());
    }
}
