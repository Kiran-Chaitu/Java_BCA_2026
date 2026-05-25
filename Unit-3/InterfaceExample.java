interface Shape{
    default void method1(){
        System.out.println("Its a default method");
    }
    static void method2(){

    }
    double area();
    double perimeter();
}

class Circle implements Shape{
    public static int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void method1(){
        System.out.println("method1 overriden in Circle");
    }
    @Override
    public double area(){
        return (3.14) * radius * radius;
    }
    @Override
    public double perimeter(){
        return 2 * (3.14) * radius; 
    } 
}
class Rectangle implements Shape{
    private int length;
    private int breadth;
    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area(){
        return length * breadth;
    }
    @Override
    public double perimeter(){
        return 2 * (length + breadth);
    }
}
interface Math{
    void add(int a,int b);
    static int square(int n){
        return n*n;
    }
    private void common(){
        System.out.println("This is the Math Interface");
        System.out.println("This is the Math Interface");
        System.out.println("This is the Math Interface");
    }
    default void method1(){
        common();
        System.out.println("Method1 from Math");
    }
    default void method2(){
        common();
        System.out.println("Method2 from Math");
    }
}
public class InterfaceExample{
    public static void main(String args[]){
        int result = Math.square(5);
        System.out.println(result);
        

        // Shape circle = new Circle(3);
        // System.out.println("Area of Circle: "+circle.area());
        // System.out.println("perimeter of Circle: "+circle.perimeter());
        // circle.method1();
        // Shape rectangle = new Rectangle(3,4);
        // System.out.println("Area of Rectangle: "+rectangle.area());
        // System.out.println("perimeter of Rectangle: "+rectangle.perimeter());
        // rectangle.method1();
    }
}