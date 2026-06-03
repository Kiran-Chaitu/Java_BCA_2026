import shape.*;
// import shape.Rectangle;
// import shape.Square;
public class Temp{
    public static void main(String args[]){
        Rectangle r = new Rectangle(5.0,3.0);
        System.out.println("Area : "+r.calculateArea());
        System.out.println("Perimeter : "+r.calculatePerimeter());

        Square s = new Square(5);
        System.out.println("Area : "+s.calculateArea());
        System.out.println("Perimeter : "+s.calculatePerimeter());
        
    } 
}
