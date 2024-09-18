public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
    public static void main(String[] args) {
        // Direct Access Using new keyword
        (new HelloThread()).start();
        // By creating an object and then access
        Thread obj = new Thread(new HelloThread());
        // Parent objname = new ChildClass();
        obj.start();
        obj.run();
    }
}
