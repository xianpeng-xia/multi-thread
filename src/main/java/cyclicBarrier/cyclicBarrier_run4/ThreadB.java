package cyclicBarrier.cyclicBarrier_run4;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:17 上午
 */
public class ThreadB extends Thread{

    MyService myService;

    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
