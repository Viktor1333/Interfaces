
void main() {
    try{
        for(int i=0; i<5;i++) {
            AThread a = new AThread();
            a.start();
            System.out.println("Thread name: "+ a.getName());
            a.setPriority(i+1);
            System.out.println("Thread priority: "+ a.getPriority());
            System.out.println("Is thread alive: "+ a.isAlive());
        }
    }catch(Exception e){
        System.out.println(e);
    }
}
