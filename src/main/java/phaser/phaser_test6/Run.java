package phaser.phaser_test6;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 11:09 下午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(2) {
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("到达了未通过！phase = " + phase + " registeredParties = " + registeredParties);
                return super.onAdvance(phase, registeredParties);
            }
        };

        System.out.println("A1 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("A1 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());

        System.out.println("A2 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("A2 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());

        System.out.println("B1 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("B1 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());

        System.out.println("B2 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("B2 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());

        System.out.println("C1 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("C1 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());

        System.out.println("C2 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("C2 getPhase = " + phaser.getPhase() + " getRegisteredParties = " + phaser.getRegisteredParties() + " getArrivedParties = " + phaser.getArrivedParties());

    }
}
