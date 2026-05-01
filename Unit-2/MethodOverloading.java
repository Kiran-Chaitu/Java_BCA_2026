public class MethodOverloading{
    public static void main(String args[]){
        Math m = new Math();
        String temp = m.greet("Kiran's");
        System.out.println(temp);
    }
}

class Math{
    void greet(){
        System.out.println("Welcome to the Math Class");
    }
    String greet(String name){
        return "Welcome to the " +name +" Class";
    }
}