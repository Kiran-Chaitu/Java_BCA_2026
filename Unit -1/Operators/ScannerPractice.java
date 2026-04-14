import java.util.Scanner;
public class ScannerPractice{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // // Sum of 2 numbers
        // System.out.print("Enter the first number :- ");
        // int firstNumber = sc.nextInt();
        // System.out.print("Enter the second number :- ");
        // int secondNumber = sc.nextInt();
        // int sum = firstNumber + secondNumber;
        // System.out.print("Sum :-"+sum);
        // System.out.print("enter length");
        // int length=sc.nextInt();
        // System.out.print("enter breadth");
        // int breadth=sc.nextInt();
        // int area=length*breadth;
        // System.out.println("area of rectangle="+area);


        //Simple interest :- (3 input):- p , t ,r
        // formula : - (p*t*r)/100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First subject marks :- ");
        int firstSubjectMarks = sc.nextInt();
        System.out.print("Enter Second subject marks :- ");
        int secondSubjectMarks = sc.nextInt();
        System.out.print("Enter Third subject marks :- ");
        int thirdSubjectMarks = sc.nextInt();

        int total = firstSubjectMarks + secondSubjectMarks + thirdSubjectMarks;
        int average = total/3;
        System.out.println("Total Marks :- "+total);
        System.out.println("Average :- "+average);


    }
}