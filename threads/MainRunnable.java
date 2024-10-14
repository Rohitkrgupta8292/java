package threads;

public class MainRunnable implements Runnable {
    public void run(){
        System.out.println("This code is running in the thread");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}
