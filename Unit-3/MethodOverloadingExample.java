import java.util.Scanner;
public class MethodOverloadingExample {
 public int add(int a, int b) {
    return a + b;
 }
 public double add(double a, double b) {
    return a + b;
 }
 public int add(int a, int b, int c) {
    return a + b + c;
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MethodOverloadingExample example = new MethodOverloadingExample();
    System.out.print("Enter first integer: ");
    int a = sc.nextInt();
    System.out.print("Enter second integer: ");
    int b = sc.nextInt();
    int sumOfTwoIntegers = example.add(a,b);
    System.out.println("Sum of 2 Integers: "+sumOfTwoIntegers);

    System.out.print("Enter first Decimal: ");
    double da = sc.nextDouble();
    System.out.print("Enter second Decimal: ");
    double db = sc.nextDouble();
    double sumOfTwoDecimals = example.add(da,db);
    System.out.println("Sum of 2 Decimals: "+sumOfTwoDecimals);
    
    System.out.print("Enter Third integer: ");
    int c = sc.nextInt();
    int sumOfThreeIntegers = example.add(a,b,c);
    System.out.println("Sum of 3 Integers: "+sumOfThreeIntegers);

 }
}