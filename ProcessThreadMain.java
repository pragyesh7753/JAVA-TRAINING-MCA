public class ProcessThreadMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ProcessThreads(), "Thread 1");
        Thread thread2 = new Thread(new ProcessThreads(), "Thread 2");
        Thread thread3 = new Thread(new ProcessThreads(), "Thread 2");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
