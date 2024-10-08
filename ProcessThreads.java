public class ProcessThreads implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
        Thread t = Thread.currentThread();
        System.out.println("Thread Started " + t.getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread Ended " + t.getName());
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ProcessThreads(), "Thread 1");
        Thread thread2 = new Thread(new ProcessThreads(), "Thread 2");
        Thread thread3 = new Thread(new ProcessThreads(), "Thread 3");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
