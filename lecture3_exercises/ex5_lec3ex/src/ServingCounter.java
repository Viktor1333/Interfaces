public class ServingCounter {
    private int capacity;
    private String[] dishes;
    private int count = 0;

    public ServingCounter(int capacity) {
        this.capacity = capacity;
        dishes = new String[capacity];
        System.out.println("Serving counter is ready with cap: "+ capacity);
    }

    public synchronized void serveDishes(String chef,String dish) {
        try{
            while(count >= capacity){
                System.out.println("Serving counter is full chef "+ chef+ " is waiting");
                wait();
            }
            dishes[count] = dish;
            count++;
            System.out.println("Chef: " + chef + " placed dish: " + dish);
            notifyAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized String takeDish(String waiter){
        String dish = null;
        try{
            if(count <= 0){
                System.out.println("Server is waiting the counter is empty");
                wait();
            }
            dish = dishes[count-1];
            count++;
            System.out.println("Server: "+waiter + " took dish: " + dish);
            notifyAll();
        }catch(Exception e){

        }
        return dish;
    }
}
