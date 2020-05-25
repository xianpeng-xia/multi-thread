package forkJoin.test4;

import java.util.concurrent.RecursiveTask;

/**
 * @date 2020/05/25
 * @time 18:21
 */
public class MyRecursiveTaskA extends RecursiveTask<Integer> {

    @Override
    protected Integer compute() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin A " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "   end A " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 100;
    }
}
