package synchronizedAndVolatile.synchronized_.stringAndSyn2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:45
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
