public class AThread extends Thread {
    private int count = 10;
    private static int tCount = 0;
    private int threadNo = ++tCount;

    public AThread() {
        System.out.println("Thread has been created");
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Thread " + threadNo + " is running");
            count--;
            if(count == 0){
                return;
            }
        }
    }
}
























//        private int count = 10;
//        private static int threadCount = 0;
//        private int threadNo = ++threadCount;
//
//        public AThread() {
//            System.out.println("Thread created");
//        }
//
//        @Override
//        public void run() {
//            while (true) {
//                System.out.println("Thread " + threadNo + " is running");
//                count--;
//                if (count == 0) {
//                    return;
//                }
//            }
//        }