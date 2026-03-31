
void main() {
    ServingCounter counter =  new ServingCounter(5);
    String[] dishes = {"Pizza", "Burger", "Pasta", "Salad", "Soup"};

    Thread chef1 = new Thread(new Chef("Alice", dishes, counter));
    Thread chef2 = new Thread(new Chef("Bob", dishes, counter));

    Thread waiter1 = new Thread(new Waiter("Waiter X", counter));
    Thread waiter2 = new Thread(new Waiter("Waiter Y", counter));

    chef1.start();
    chef2.start();
    waiter1.start();
    waiter2.start();

    try{
        Thread.sleep(15000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }

    chef1.interrupt();
    chef2.interrupt();
    waiter1.interrupt();
    waiter2.interrupt();

    System.out.println("Restaurant simulation ended");
}
