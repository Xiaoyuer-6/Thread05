package thread.thread_0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 09:23
 */
//原始创建线程池的党法
public class ThreadDemo55 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5,5,60, TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000));
    executor.execute(new Runnable() {
        @Override
        public void run() {
            System.out.println(" 线程名"+Thread.currentThread().getName());
        }
    });
    }
}
