package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessExample {
    Lock lock = new ReentrantLock(true);


    public void example()  {

   lock.lock();
        System.out.println(Thread.currentThread().getName()+" accessing...");
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" unlocking...");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessExample fairnessExample = new FairnessExample();

        Runnable runnable =()->{
            {
                fairnessExample.example();
            }
        };

        Thread t1 = new Thread(runnable,"thread1");
        Thread t2 = new Thread(runnable,"thread2");
        Thread t3 = new Thread(runnable,"thread3");

        t1.start();
        t2.start();
        t3.start();



    }








        }
