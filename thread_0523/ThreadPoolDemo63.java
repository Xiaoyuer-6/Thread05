package thread.thread_0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 11:11
 */
public class ThreadPoolDemo63 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000)
        );
        for (int i = 0; i <10 ; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(String.format("编号:%d,线程名" +
                            "" +
                            ""));
                }
            });

        }
    }
}
