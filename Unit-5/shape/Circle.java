package shape;
public class Circle{
    private double radius;
    public Square(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return 3.14 * radius * radius;
    }
    public double calculatePerimeter(){
        return 2* 3.14 * radius;
    }
    
}
