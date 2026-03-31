public class ServingCounter {
   private String[] dishes;
   private int capacity;
   private int count = 0;

    public ServingCounter(int capacity) {
        this.capacity = capacity;
        dishes = new String[capacity];
        System.out.println("Serving counter is read with max dishes of: "+ capacity);
    }

    public synchronized void placeDish(String chef, String dish) {
        try{
            while(count >= capacity){
                System.out.println("Chef " + chef + " waiting - counter is full");
                wait();
            }
            dishes[count] = dish;
            count++;
            System.out.println("Chef: " + chef + " placed dish: " + dish);
            notifyAll();
        }catch(Exception e){
            System.out.println("Serving counter exception");
        }
    }

    public synchronized String takeDish(String waiter){
        String dish = null;
        try{
            while(count <= 0){
                System.out.println("Waiter " + waiter + " waiting - no dishes available");
                wait();
            }

            dish = dishes[count-1];
            count--;
            System.out.println("Waiter: " + waiter + " took dish: " + dish);
        }catch(Exception e){
            System.out.println("Serving counter exception");
        }
        return dish;
    }






}

