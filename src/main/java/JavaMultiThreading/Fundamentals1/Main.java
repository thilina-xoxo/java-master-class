package JavaMultiThreading.Fundamentals1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // thread creation using runnable interface
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // code that run in a new thread
                System.out.println("We are now in thread" + Thread.currentThread().getName());
            }
        });
        thread.setName("New worker thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("we are in thread" + Thread.currentThread().getName() + "before starting thread");
        thread.start();
        System.out.println("We are in thread" + Thread.currentThread().getName() + "Afer starting thread");

        Thread.sleep(1000);

    }
}
