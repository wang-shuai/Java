package com.test.threads;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by wangshuai on 2019/6/25.
 */
public class SemaphoreTest implements Runnable {

    int index;
    private Semaphore semaphore;

    public SemaphoreTest(int index, Semaphore semaphore) {
        this.index = index;
        this.semaphore = semaphore;
    }

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(30);
        ExecutorService executorService = new ThreadPoolExecutor(
                3,
                10,
                2L,
                TimeUnit.SECONDS,
                queue);

        for(int i=1;i<20;i++) {
            executorService.execute(new SemaphoreTest(i, semaphore));
        }
        System.out.println("main thread is waitting " + semaphore.availablePermits());

//        TimeUnit.SECONDS.sleep(8);
        executorService.shutdown();

        while (true) {//等待所有任务都执行结束
            if (executorService.isTerminated()) {//所有的子线程都结束了
                System.out.println("all thread executed " + semaphore.availablePermits());
                break;
            }
        }


//        System.exit(1);
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(index + " get permit");
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(200));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
