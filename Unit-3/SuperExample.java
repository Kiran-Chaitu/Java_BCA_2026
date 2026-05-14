class Human{
    String name;
    Human(String name){
        this.name = name;
    }
    public void displayName(){
        System.out.println("Name :-" + name);
    }
}
class Student extends Human{
    String usn;
    Student(String name,String usn){
        // super.name = name;
        super(name);
        this.usn = usn;
    }
    public void displayDetails(){
        super.displayName();
        System.out.println("USn:- " +usn);
    }
}
public class SuperExample{
    public static void main(String args[]){
        Student st = new Student("Kiran" , "5D0");
        st.displayDetails();
    }
}