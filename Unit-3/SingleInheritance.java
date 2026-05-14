class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
    public void hasHouse(){
        System.out.println("Parent have House");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
    public void hasDegree(){
        System.out.println("Child have Degree");
    }
}
public class SingleInheritance{
    public static void main(String args[]){
        Child ch = new Child();
        ch.hasDegree();
        ch.hasHouse();
    }
}