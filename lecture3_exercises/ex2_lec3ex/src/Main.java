
void main() {
try{
    Clock c1 = new Clock("Rolex",500);
    Clock c2 = new Clock("Casio",900);

    Thread t1 = new Thread(c1);
    Thread t2 = new Thread(c2);
    t1.start();
    t2.start();
}catch(Exception e){
    System.out.println(e);
}
}
