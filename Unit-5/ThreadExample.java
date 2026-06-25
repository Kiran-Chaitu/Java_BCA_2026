
// Implementing threads using Runnable interface is much better 
// // than Extending Thread Class
// class MyThread implements Runnable{
//     public void run(){
//         for(int i = 1;i<=5;i++){
//             System.out.println("Child Thread : "+i);
//         }
//     }
// }
class MyThread extends Thread{
    public void run(){
        //thread logic
        for(int i = 1;i<=5;i++){
            System.out.println("Child Thread : "+i);
        }
    }
}
public class ThreadExample{
    public static void main(String args[]){
        try{
            MyThread t1 = new MyThread();
            System.out.println(t1.isAlive());
            t1.start();
            System.out.println(t1.isAlive());
            t1.join();
            t1.sleep(2000);
            for(int i =1;i<=5;i++){
                System.out.println("Main Thread :"+i);
            }
            System.out.println(t1.isAlive());

        }catch(Exception e){
            System.out.println("Error Occured");
        }
        
        
        
        
        

    }
}