package com.ppdtbb.threaddemo;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author wanggang
 * @Date 2021/3/30 0030
 */
@Slf4j
public class AsyncExecutorUtil {

    private static Logger logger = LoggerFactory.getLogger(AsyncExecutorUtil.class);

    /**
     * 创建异步任务线程池，可容纳10个线程
     */
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void asyncHandle(String appId) {

        if ("".equals(appId)) {

        }

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                Map<String, Object> map = Maps.newHashMap();
                System.out.println("#==============异步执行==============#");
                //System.out.println("appId: " + appId);
                map.put("appId", appId);
            }
        });
    }

}
