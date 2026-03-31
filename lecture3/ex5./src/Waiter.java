public class Waiter implements Runnable {
    private String name;
    private String[] specialties;
    private ServingCounter servingCounter;

    public Waiter(String name, ServingCounter servingCounter) {
        this.name = name;
        this.servingCounter = servingCounter;
    }

    @Override
    public void run() {
        try {
            while(true){
                String dish = servingCounter.takeDish(name);

                System.out.println(name + " is serving: " + dish);
                Thread.sleep(1000);
                Thread.sleep(500);

            }
        }catch (InterruptedException e){
            System.out.println("Serving interrupted");
        }
    }
}
