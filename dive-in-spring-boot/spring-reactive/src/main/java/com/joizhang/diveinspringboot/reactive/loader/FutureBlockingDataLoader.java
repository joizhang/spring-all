package com.joizhang.diveinspringboot.reactive.loader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 阻塞数据加载器
 */
public class FutureBlockingDataLoader extends DataLoader {

    @Override
    protected void doLoad() {
        // loadConfigurations，loadUsers和loadOrders存在依赖，需要等待
        ExecutorService executorService = Executors.newFixedThreadPool(3); // 创建线程池
        runCompletely(executorService.submit(super::loadConfigurations));
        runCompletely(executorService.submit(super::loadUsers));
        runCompletely(executorService.submit(super::loadOrders));
        executorService.shutdown();
    }

    private void runCompletely(Future<?> future) {
        try {
            future.get();
        } catch (Exception ignored) {
        }
    }

    public static void main(String[] args) {
        new FutureBlockingDataLoader().load();
    }

}
