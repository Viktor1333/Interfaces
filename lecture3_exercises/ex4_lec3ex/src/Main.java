import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
void main() {
    ExecutorService executor = Executors.newFixedThreadPool(5);
    for(int i=0;i<10;i++) {
        executor.execute(new WorkerClass("Message: "+i));
    }
    executor.shutdown();

    while(!executor.isTerminated()){
        System.out.println("Waiting for threads to finish");
    }
    System.out.println("Finished all threads");
}
