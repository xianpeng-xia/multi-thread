package executorService.executorService_invokeAny_2;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 12:16 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB " + Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
        for (int i = 0; i < 19345; i++) {
            String newString = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();

            System.out.println("MyCallableB running " + (i + 1));
        }

        if (true) {
            System.out.println("xxxxxxxxx interrupted");
            throw new InterruptedException();
        }
        System.out.println("MyCallableB " + Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        return "Ruturn B";
    }
}
