package com.ppdtbb.threaddemo;

import java.time.LocalDateTime;

/**
 * 守护进程
 * @Author wanggang
 * @Date 2021/4/1 0001
 */
public class DaemonThreadDemo {

    public static void main(String[] args) {
        boolean isDaemon = false;
        AsynTask task = new AsynTask();
        Thread thread1 = new Thread(task);
        if (isDaemon) {
            thread1.setDaemon(true);
        }
        thread1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (isDaemon) {
            System.out.println("thread1设置为了守护进程，System.out 语句执行结束后，主进程结束，jvm退出，守护进程自动销毁");
        } else {
            System.out.println("thread1为用户进程，System.out 语句执行结束后，主进程结束，用户进程继续执行");
        }
    }

    static class AsynTask implements Runnable {
        @Override
        public void run() {
            int i = 0;
            while (i<20) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                System.out.println(LocalDateTime.now() + "-hello,thread");
            }
        }
    }

}
