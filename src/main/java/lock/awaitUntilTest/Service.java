package lock.awaitUntilTest;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 11:20
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("wait begin timer = " + System.currentTimeMillis());
            condition.awaitUntil(calendarRef.getTime());
            System.out.println("wait   end timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("notify begin timer = " + System.currentTimeMillis());
            condition.signalAll();
            System.out.println("notify   end timer = " + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}
