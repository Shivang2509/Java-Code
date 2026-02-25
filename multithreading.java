import java.util.*;
class T1 extends Thread{
    public void run(){
        for(int i =0 ;i<=5;i++){
            System.out.println(i);
        }
    }
}
class T2 extends Thread{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println(i);
        }
    }
}


public class multithreading{
    public static void main(String[] args) throws InterruptedException {



        T1 t1=new T1();
        t1.start();
        t1.join();

        T2 t2=new T2();
        t2.start();
        t2.join();

    }
}