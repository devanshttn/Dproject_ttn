import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static ReentrantLock lock = new Reentrantlock();

    public static void main(String[] args) {

        new Thread({
        public void run()
        {
            doSomething();
        }
        }).start();

        new Thread({
        public void run()
        {
            doSomething();
        }
        }).start();


        public static void doSomething()
        {
            lock.lock();
            try
            {
                System.out.println(Thread.currentThread().getName()=" acquired lock..");
            }
            finally{
                lock.unlock();
                System.out.println(Thread.currentThread().getName()=" released the lock..");
            }
        }

        System.out.println("Hello world!");
    }
}