import java.util.Scanner;
public class LabProgramFive{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input;
        do{
            System.out.println("Enter C to create Objects");
            System.out.println("Enter Q to quit the program");
            input = sc.nextLine();
            if(input.equalsIgnoreCase("C")){
                Student st = new Student();
            }
        }while(!(input.equalsIgnoreCase("q")));
        System.out.println("Objects Created :-" +Student.counter);
    }
}

class Student{
    public static int counter=0;
    final static int maxObjects = 5;
    Student(){
        if(counter < maxObjects){
            System.out.println("Object is Created");
            counter++;
        }else{
            System.out.println("Maximum limit is reached");
        }
        
    }
}