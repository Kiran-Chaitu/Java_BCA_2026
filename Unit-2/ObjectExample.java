class Student{
    // public String name;
    // public int marks; // instance variables
    // public static final String CLG_NAME = "NCET"; //FINAL class varibale
    // Student(String name , int marks){
    //     this.name = name;
    //     this.marks = marks;
    // }
    // public static void displayDetails(){
    //     // System.out.println("Name: "+name);
    //     // System.out.println("Marks: "+marks); //instatnce varibales can't be accesed
    //     System.out.println("Clg Name: "+CLG_NAME);
    // }

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

    public String name; //instance variable
    public Student(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Student class from object";
    }
    @Override
    public boolean equals(Object obj){
        Student other = (Student) obj;
        return this.name == other.name;
    }
}
public class ObjectExample{
    public static void main(String[] args){
        Student st = new Student("Chaitu");
        Student st2 = new Student("Chaitu");
        System.out.println(st);// st.toString()
        System.out.println(st == st2); 
        System.out.println(st.equals(st2)); 
    }
}
