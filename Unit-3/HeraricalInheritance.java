class Avengers{
    Avengers(){
        System.out.println("Avengers");
    }
    public void avengersAssemble(){
        System.out.println("Avengers Assemble");
    }
}
class IronMan extends Avengers{
    IronMan(){
        System.out.println("IronMan");
    }
    public void hasArcReactor(){
        System.out.println("IronMan have Arc Reactor");
    }
}
class Thor extends Avengers{
    public String name;
    Thor(){
        System.out.println("Thor");
    }
    public void thunderGod(){
        var power = 1000;
        System.out.println("Thor is a Thunder God");
    }
}
class Hulk extends Avengers{
    Hulk(){
        System.out.println("Hulk");
    }
    public void hulkSmash(){
        System.out.println("Hulk smashes everything");
    }
}
public class HeraricalInheritance{
    public static void main(String args[]){
        Thor th = new Thor();
        th.avengersAssemble();
        IronMan im = new IronMan();
        im.avengersAssemble();
    }
}