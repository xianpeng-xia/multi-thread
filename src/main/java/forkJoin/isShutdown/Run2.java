package forkJoin.isShutdown;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/26
 * @time 17:06
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(runnable);
        System.out.println("A " + forkJoinPool.isShutdown());
        forkJoinPool.shutdownNow();
        Thread.sleep(5000);
        System.out.println("B " + forkJoinPool.isShutdown());

    }
}
