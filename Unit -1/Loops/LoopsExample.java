import java.util.Scanner;
public class LoopsExample{
    public static void main(String args[]){
    
        
        // int i =1; // initilization
        // while(i <= 10){ 
        //     if(i%2==0) System.out.println(i);
        //     i++; // updation
        // }


        // 1234
        // count :- 4 digits
        // sum of digits = 1+2+3+4+5+6+7 = 28
        // int n=1234567 , count = 0 , sum = 0;
        // while(n > 0){
        //     int digit = n%10;
        //     sum+=digit;
        //     n = n/10;
        //     count++;
        // }
        // System.out.println("No.of digits:-" +count);
        // System.out.println("Sum of digits:-" +sum);

        // int i=10;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=5);

        // Scanner sc = new Scanner(System.in);
        // int row=sc.nextInt();
        // int col=sc.nextInt();
        // for(int i = 1;i<=row;i++){
        //     for(int j = 1;j<=col;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        // int row=sc.nextInt();
        // int col=sc.nextInt();
        // for(int i = 1;i<=row;i++){
        //     for(int j = 1;j<=col;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        //  int[] marks = new int[5];
        //  long[] temp = new long[5];
        //  boolean[] flag = new boolean[5];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:-");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("Enter the values of the array:-");
        for(int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Values of the array:-");
         for(int i=0;i < size;i++){
            System.out.print(marks[i]+" ");
         } 






    }
}