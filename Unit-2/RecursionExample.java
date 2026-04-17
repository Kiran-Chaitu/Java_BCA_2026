public class RecursionExample{
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);   
        fun(n-1);
        System.out.println(n);   
    }





    static int sumOfNaturalNumbers(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfNaturalNumbers(n-1);
    }


    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        // fun(5);
        //sum of n natural numbers
        // 5
        // 5+4+3+2+1 = 15
        int sum = sumOfNaturalNumbers(5);
        System.out.println(sum);
        // 5*4*3*2*1= 120
        int factorialOfNumber=factorial(4);
        
        
    }
}

class Student{
    String name;
    int marks;
    static final String CLG_NAME="NCET";
    Student(){
        this.name = "Kiran";
        this.marks = 99;
    }
    Student(String name , int marks){
        this.name = name;
        this.marks = marks;   
    }


    static void SumOfTwo(){
        System.out.println(5+2);
    }
    static int SumOfTwo(int a,int b){
        return a+b;
    }

    static void displayDetails(){
        // System.out.println(name);
        // System.out.println(marks);
        System.out.println(CLG_NAME);
    }
}