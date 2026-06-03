import shape.*;
class RectangleThread extends Thread{
    public void run(){
        Rectangle r = new Rectangle(5.0,3.0);
        System.out.println("Area : "+r.calculateArea());
        System.out.println("Perimeter : "+r.calculatePerimeter());
    }
}
class SquareThread extends Thread{
    public void run(){
        Square s = new Square(5);
        System.out.println("Area : "+s.calculateArea());
        System.out.println("Perimeter : "+s.calculatePerimeter());
    }
}
public class ThreadExample{
    public static void main(String args[]){
        RectangleThread rect = new RectangleThread();
        SquareThread sq = new SquareThread();
        rect.start();
        sq.start();
        System.out.println("Main Class Started");
        System.out.println("Main Class Ended");
    }
}