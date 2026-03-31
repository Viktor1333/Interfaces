public class Chef implements Runnable {

    private String name;
    private String[] specialties;
    private ServingCounter servingCounter;

    public Chef(String name, String[] specialties, ServingCounter servingCounter) {
        this.name = name;
        this.specialties = specialties;
        this.servingCounter = servingCounter;
    }

    @Override
    public void run() {
        try{
            while(true){
                String dish = specialties[(int)(Math.random()*specialties.length)];
                System.out.println("Chef: "+ name + " is preparing: "+ dish);
                Thread.sleep(1000);
                servingCounter.placeDish(name,dish);
                Thread.sleep(1000);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
