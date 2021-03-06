package executors.newCachedThreadPoolFactory;

import java.util.concurrent.ThreadFactory;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 7:15 下午
 */
public class MyThreadFactory implements ThreadFactory {


    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("定制池中的线程对象名称" + Math.random());
        return thread;
    }
}
