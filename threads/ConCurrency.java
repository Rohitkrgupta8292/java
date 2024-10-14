package threads;
// ConCurrency problem = Because thread run at the same time as other part of programs, there is a no way to know in which order will the code will run, when the thread and Main program are reading and writing the same variable, the values are unpredictable, the problem that result this are called concurrency problems.
public class ConCurrency extends Thread {
    public static int amount = 0;
    public void run(){
        amount++;
    }
    public static void main(String[] args) {
        ConCurrency thread = new ConCurrency();
        thread.start();
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
}
