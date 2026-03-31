public class WorkerClass implements Runnable {
    private String message;

    public WorkerClass(String message) {
        this.message = message;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (START) "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+" (END) "+message);
    }
    public void processMessage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}