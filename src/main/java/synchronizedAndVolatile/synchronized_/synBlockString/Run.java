package synchronizedAndVolatile.synchronized_.synBlockString;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:30
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
