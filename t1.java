public class t1 extends Thread {


    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);

        }
    }
}
    class t2 extends Thread {
        public void run() {
            for (int i = 6; i <= 10; i++) {
                System.out.println(i);

            }
        }

    }
    class Multithreading{
        public static void main(String[] args) throws InterruptedException{
            t1 obj1 = new t1();
            t2 obj2 = new t2();

            obj1.start();
            obj1.join();

            obj2.start();
        }
} 
