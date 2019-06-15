package lock.lockInterruptiblyTest2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-15 23:36
 */
public class Service {

    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String str = new String();
                Math.random();
                //System.out.println("lock :" + Thread.currentThread().getName() +" print " +i);
            }
            System.out.println("lock end " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }

}
