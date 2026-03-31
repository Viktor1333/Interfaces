
void main() {

    for(int i = 0;i < 5;i++){
        AThread t = new AThread();
        t.start();
        System.out.println("Thread name: "+ t.getName());
        t.setPriority(i+1);
        System.out.println("Thread priority: "+ t.getPriority());
        System.out.println("Is thread alive: "+ t.isAlive());

    }
    System.out.println("All threads are started");


}
