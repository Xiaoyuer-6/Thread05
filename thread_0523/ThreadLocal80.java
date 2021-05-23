package thread.thread_0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 17:11
 */
public class ThreadLocal80 {
    static ThreadLocal<MyBigClass> threadLocal = new ThreadLocal<>();
    static class MyBigClass{
        private byte[] bytes = new byte[1+1024+1024];
    }
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,0, TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000));
        for (int i = 0; i <5 ; i++) {
            int finalI = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println();
                }
            });

        }
    }
}
