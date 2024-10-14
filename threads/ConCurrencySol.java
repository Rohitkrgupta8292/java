package threads;
// Solution of ConCurrency problem to use isAlive() method tol solve the problem of ConCurrency problem.
public class ConCurrencySol extends Thread {
    public static int amount = 0;
    public void run(){
        amount++;
    }
    public static void main(String[] args) {
        ConCurrencySol thread = new ConCurrencySol();
        thread.start();
        while(thread.isAlive()){ // wait for thread to finish.
            System.out.println("Waiting...");
        }
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
}
