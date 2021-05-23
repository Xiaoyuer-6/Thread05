package thread.thread_0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 09:46
 */
public class TheadDemo56 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5, 5, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(1000));
        for (int i = 0; i < 6; i++) {


            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(" 线程名" + Thread.currentThread().getName());
                }
            });
        }
    }
}
