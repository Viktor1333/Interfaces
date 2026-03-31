public class AThread extends Thread {
    private int count = 10;
    private static int t = 0;
    private int threadNo = ++t;

    public AThread() {
        System.out.println("AThread created");
    }
    @Override
    public void run() {
        while(true){
            System.out.println("Thread: "+ threadNo+ " has been created.");
            count--;
            if(count == 0){
                return;
            }
        }
    }
}
