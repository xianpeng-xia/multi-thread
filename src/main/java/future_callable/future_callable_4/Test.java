package future_callable.future_callable_4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:31 下午
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyCallable myCallable = new MyCallable();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

            Future<String> future = threadPoolExecutor.submit(myCallable);

            System.out.println(future.get());

            System.out.println(future.cancel(true) + " " + future.isCancelled());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
