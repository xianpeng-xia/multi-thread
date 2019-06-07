package synchronizedAndVolatile.synchronized_.throwExceptionNotLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:18
 */
public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
