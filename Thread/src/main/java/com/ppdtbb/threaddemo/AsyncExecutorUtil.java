package com.ppdtbb.threaddemo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author wanggang
 * @Date 2021/3/30 0030
 */
@Slf4j
public class AsyncExecutorUtil {

    /**
     * 创建异步任务线程池，可容纳10个线程
     */
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void async() {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("#==============异步执行==============#");
            }
        });
    }

}
