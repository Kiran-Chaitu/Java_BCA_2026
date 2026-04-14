import java.util.Scanner;
public class ArraysExample{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array:- ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the  of values of the array:- ");
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int sum = 0;
        // System.out.println("Even Sum of the array:- ");
        // for(int i=0;i<n;i++){
        //     if(arr[i]%2==0){ 
        //         sum +=arr[i];
        //     }
        // }
        // System.out.print(sum);





        // // 2D arrays
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no. rows:- ");
        // int rows = sc.nextInt();
        // System.out.println("Enter the no. columns:- ");
        // int columns = sc.nextInt();
        // int[][] mat = new int[rows][columns];
        // System.out.println("Enter the values of matrix:- ");
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<columns;j++){
        //         mat[i][j] = sc.nextInt();
        //     }
        // // }
        // // System.out.println("Values of the matrix:- ");
        // // int sum=0;
        // // for(int i = 0; i < rows; i++){
        // //     for(int j = 0;j<columns;j++){
        // //         sum+=mat[i][j];
        // //     }
        // // }
        // // System.out.println(sum);




        // // operator precedence
        // // + , - , * , / ,  % , () ,
        // // BODMAS
        // // 2 + 3 * 6
        // // () ,++, --,  / ,% ,  * , + , - 
        // int a=2;
        // System.out.println( (a++) + 3 *(10 / 5 * 2) + (a++)); // 14

        // System.out.println(a); // 3

        // // Type casting or type promotion
        // // double decimals (12.36)

        // implicit automatic , smaller to larger
        // int a = 10;
        // double b = a; // 10.00
        // char ch = 'A';
        // int num = ch;

        // // // explicit manual , larger to smaller , data loss
        // double d = 10.36;
        // int n = (int) d; // 10

        // // // type promotion
        // int num1 = 10;
        // double d1 = 10.36;
        // double sum = num1+d1; //

        // // ternary operator
        // // (condition) ? "true value" : "false value";
        // int num =3;
        // System.out.println((num %2 ==0) ? "Even" : "Odd");


        // for -Each loop


        int[] marks = {90,99,97,96,95};

        for(int i=0;i< 5;i++ ){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        //syntax of for each loop
        // for(datatype  varibleName : arrayName){
        //     //block of code
        // }

        for(int  num : marks){
            System.out.print(i+" ");
            
        }


        // int a = 10;
        // int b = a;
        // System.out.println(b); // 10
        // b = 20;
        // System.out.println(b); // 20
        // System.out.println(a); // 10




        for(int i=0;i< 5;i++ ){
            System.out.print(marks[i]+" ");
        }

        

    }
}