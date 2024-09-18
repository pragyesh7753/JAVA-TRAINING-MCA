public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        // Direct Access Using new keyword
        (new Thread(new HelloRunnable())).start();
        // By creating an object and then access
        Runnable runnable = new HelloRunnable();
        Thread obj = new Thread(runnable);
        obj.start();
        obj.run();
    }
}
