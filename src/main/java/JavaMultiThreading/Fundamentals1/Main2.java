package JavaMultiThreading.Fundamentals1;

public class Main2 {
    public static void main(String[] args) {
        Thread thread = new  newThread();

        thread.start();
    }

    // why kill two birds in one stone
    public static class newThread extends Thread {
        @Override
        public void run() {
            // code that run in new thread
            System.out.println("New thread started " + this.getName());
        }
    }
}
