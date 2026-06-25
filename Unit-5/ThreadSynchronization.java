class MyThread extends Thread {

    static int count = 0;

    static  void increment() {
        count++;
    }

    @Override
    public void run() {

        for(int i = 0; i < 10000; i++) {
            increment();
        }

    }
}

public class ThreadSynchronization {

    public static void main(String[] args)
            throws Exception {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count = " + MyThread.count);
    }
}