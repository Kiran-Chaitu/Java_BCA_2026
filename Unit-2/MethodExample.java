
//Method Overloading
// class Calculator{
//     int add(int a,int b){
//         return a+b;
//     }
//     double add(double a , double b){
//         return a+b;
//     }
//     int add(int a , int b , int c){ 
//         return a+b+c;
//     }
    
// }

import java.util.Scanner;
public class MethodExample{
    public static void main(String[] args){
        // Object
        // Calculator cal = new Calculator();
        // cal.greet();
        // cal.areaOfSquare(4) //arguments
        // int result =  cal.add();
        // double area = cal.areaOfCircle(4); //argumnets
        // System.out.print(area);

        // Student st = new Student();
        // double average = st.calculateAverage(90 , 80 , 95);
        // // System.out.println(average);
        // char grade = st.getGrade(66);
        // System.out.println("grade: "+grade);

        // Calculator calc = new Calculator();
        // int sumOfTwo = calc.add(10,20);
        // int sumOfThree = calc.add(10,20,30);
        // double sumOfDecimals = calc.add(11.1 , 10.1);

        // System.out.println(sumOfTwo);
        // System.out.println(sumOfThree);
        // System.out.println(sumOfDecimals);
        // System.out.print("Enter the name: ");
        // String name = scan.nextLine();
        // System.out.print("Enter the roll Number: ");
        // String rollNumber =scan.nextLine();

        // Student s1 = new Student(name , rollNumber);
        // s1.displayDetails(); 

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the title: ");
        // String title  = scan.nextLine();
        // System.out.print("Enter the Author name: ");
        // String author = scan.nextLine();
        // System.out.print("Enter the price: ");
        // int price = scan.nextInt();

        // Book b = new Book(title , author ,price);
        // System.out.println(b.price);
        






        // Student sc = new Student("Kiran" , 95);
        // int marks = sc.getMarks();
        // System.out.println("Marks: "+marks);
        // sc.updateMarks(99);
        // marks = sc.getMarks();
        // System.out.println("Marks: "+marks);



        Bank b = new Bank("Kiran" , 1000);
        
        b.depositMoney(500);
        int balance = b.getBalance();
        System.out.println(balance);

        b.withDrawMoney(200);
        balance = b.getBalance();
        System.out.println(balance);
    }
}

class Bank{
    public String accountHolderName;
    private int balance;
    Bank(String accountHolderName , int balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void depositMoney(int amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.print("Invalid amount");
        }
    }
    void withDrawMoney(int amount){
        if(amount < balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficent Money");
        }
     
    }
    int getBalance(){
        return balance;
    }


}









// class Student{
//     private int marks;
//     public String name;

//     Student(String name ,int marks){
//         this.name = name;
//         this.marks = marks;
//     }
//     public int getMarks(){ // getters
//         return marks;
//     }

//     public void updateMarks(int newMarks){ //setters
//         marks = newMarks;
//     }
// }














// class Book{
//     private String title;
//     public String author;
//     protected int price;

//     Book(String title , String author , int price){
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }

//     void bookDetails(){
//         System.out.println("Title: "+title);
//         System.out.println("Author: "+author);
//         System.out.println("Price: "+price);

//     }
// }












// class Student{
//     String name;
//     String rollNumber;
    
//     Student(String name , String rollNumber){
//         this.name = name;
//         this.rollNumber = rollNumber;
//     }

//     void displayDetails(){
//         System.out.println("Student Details: ");
//         System.out.println("Name: "+name);
//         System.out.println("Roll Number: "+rollNumber);

//     }
// }










