package threadOrRunnable.stopThread.useReturnInterrupt;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 11:24
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了");
                return;
            }
            System.out.println("timer = " + System.currentTimeMillis());
        }
    }
}
