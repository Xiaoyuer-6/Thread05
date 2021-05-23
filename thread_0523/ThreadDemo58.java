package thread.thread_0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 09:59
 */
public class ThreadDemo58 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,5,0, TimeUnit.SECONDS,new LinkedBlockingDeque<>(5));
        for (int i = 0; i <11 ; i++) {
            int finaLI = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("任务:"+ finaLI+".线程名+ "+Thread.currentThread().getName());
                }
            });
        }
    }
}
