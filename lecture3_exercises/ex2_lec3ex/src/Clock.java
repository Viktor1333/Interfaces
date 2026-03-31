public class Clock implements Runnable {
    private String name;
    private int rate;

    public Clock(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Tick");
            try{
                Thread.sleep(rate);
            }catch(InterruptedException e){
                System.out.println("Tick interrupted");
            }
            System.out.println("Tack");
            try{
                Thread.sleep(rate);
            }catch(InterruptedException e){
                System.out.println("Tick interrupted");
            }
        }
    }
}
