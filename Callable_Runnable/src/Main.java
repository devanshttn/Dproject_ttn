import java.util.concurrent.*;

class RunnableDemo implements Runnable{
    @Override
    public void run(){
        System.out.println("This is runnable interface");
    }
}

class CallableDemo implements Callable<Long>{

    long  fact,sum=1;
    CallableDemo(int fact1)
    {
        this.fact = fact1;
    }
    public Long call() throws Exception
    {
        for(int i=1;i<=fact;i++)
        {
            sum *= i;
        }
        return sum;
    }

}
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunnableDemo rd = new RunnableDemo();
        Thread t1 = new Thread(rd);
        System.out.println("Hello world!!!!!!!!!!!!!!!!!!!!!");
        t1.start();

        CallableDemo c = new CallableDemo(5);
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Long> res = ex.submit(c); // executor takes one thread from pool

        System.out.println(res.get());
        ex.shutdown();

        System.out.println("Hello world!");
    }
}