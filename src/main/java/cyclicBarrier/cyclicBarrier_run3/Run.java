package cyclicBarrier.cyclicBarrier_run3;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:05 上午
 */
public class Run {

    public static void main(String[] args) {

        MyService myService = new MyService();

        ThreadA threadA = new ThreadA(myService);
        threadA.start();

        ThreadB threadB = new ThreadB(myService);
        threadB.start();

    }
}
