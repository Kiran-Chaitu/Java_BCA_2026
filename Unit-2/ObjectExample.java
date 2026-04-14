public class ObjectExample{
    public static void main(String[] args){
        Student s1 = new Student("Kiran" , 95 );
        Student s2 = new Student("Chaitu" , 99 );
        Student.CLG_NAME = "NGI"; // THORWS ERRORS
        Student.displayDetails();
        final double PI_VALUE = 3.14;
        PI_VALUE= 5.36; // THROWS ERRORS
    }
}
class Student{
    public String name;
    public int marks; // instance variables
    public static final String CLG_NAME = "NCET"; //FINAL class varibale
    Student(String name , int marks){
        this.name = name;
        this.marks = marks;
    }
    public static void displayDetails(){
        // System.out.println("Name: "+name);
        // System.out.println("Marks: "+marks); //instatnce varibales can't be accesed
        System.out.println("Clg Name: "+CLG_NAME);
    }

    // public Student highestMarks(Student other){
    //     if(this.marks > other.marks){
    //         return this;
    //     }else if(this.marks == other.marks){
    //         return this;
    //         // return other;
    //     }else{
    //         return other;
    //     }
    // }
     // public void displayDetails(Student other){
    //     System.out.println("My Student name: "+this.name);
    //     System.out.println("Other Student name: "+other.name);
    //     System.out.println("My Student Marks: "+this.marks);
    //     System.out.println("Other Student Marks: "+other.marks);
    //     other.name = "Naruto";
    // }
}