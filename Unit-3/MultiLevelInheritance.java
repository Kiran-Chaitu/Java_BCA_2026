class GrandParent{
    GrandParent(){
        System.out.println("GrandParent Constructor");
    }
    public void hasLand(){
        System.out.println("GrandParent have Land");
    }
}
class Parent extends GrandParent{
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
        super.hasHouse();
    }
}
public class MultiLevelInheritance{
    public static void main(String args[]){
        Child ch = new Child();
        ch.hasDegree();
        
    }
}