package com.java.base;

import java.util.concurrent.CountDownLatch;

/**
 * @User xiangyl
 * @Data 2021/5/26
 */
public class CountDownLanchTest {

    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("线程名：" + Thread.currentThread().getName());
                countDownLatch.countDown();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("线程名：" + Thread.currentThread().getName());
                while (true){}
                //countDownLatch.countDown();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("阻塞前。。");
                    countDownLatch.await();
                    System.out.println("阻塞后。。。");
                } catch (Exception e) {
                }
            }
        });

        //thread1.start();
        thread2.start();
        //thread3.start();

        try {
            System.out.println("主线程阻塞前...");
            //countDownLatch.await();
            System.out.println("主线程阻塞后...");
        } catch (Exception e) {
        }
    }
}
