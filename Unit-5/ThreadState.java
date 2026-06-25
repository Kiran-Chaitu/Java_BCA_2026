class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);
        } catch(Exception e) {}
    }
}

public class ThreadState {
    public static void main(String[] args)
            throws Exception {
        MyThread t = new MyThread();
        System.out.println(
            "State 1 : " + t.getState()
        );
        t.start();
        System.out.println(
            "State 2 : " + t.getState()
        );
        Thread.sleep(100);
        System.out.println(
            "State 3 : " + t.getState()
        );
        t.join();
        System.out.println(
            "State 4 : " + t.getState()
        );
    }
}