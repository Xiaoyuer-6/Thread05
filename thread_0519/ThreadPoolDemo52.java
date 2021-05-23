package thread.thread_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-19
 * Time: 21:06
 */
public class ThreadPoolDemo52 {
    public static void main(String[] args) {

    ExecutorService service = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < 10; i++) {


            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("" + Thread.currentThread().getName());
                }
            });
        }
}
}
