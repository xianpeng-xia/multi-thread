package synchronizedAndVolatile.synchronized_.innerClassTest.test_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:12
 */
public class OutClass {

    static class InnerClass1 {

        public void method1(InnerClass2 class2) {
            String threadName = Thread.currentThread().getName();
            synchronized (class2) {
                System.out.println(threadName + " enter InnerClass1 . method1");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + " leave InnerClass1 . method1");
            }
        }

        public synchronized void method2() {
            String threadName = Thread.currentThread().getName();

            System.out.println(threadName + " enter InnerClass1 . method2");
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " leave InnerClass1 . method2");
        }
    }

    static class InnerClass2 {

        public synchronized void method1() {
            String threadName = Thread.currentThread().getName();

            System.out.println(threadName + " enter InnerClass2 . method1");
            for (int k = 0; k < 10; k++) {
                System.out.println("k = " + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " leave InnerClass2 . method1");
        }
    }
}
