public class Main {
    public static void main(String[] args) {

        TickTack t1 = new TickTack("Casio ", 650);
        TickTack t2 = new TickTack("Rolex ", 900);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}