package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xianpeng.xia
 * on 2020/12/24 上午1:36
 */
public class SingleThreadExecutor {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            executorService.execute(new Task());
        }
    }

}

class Task implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
