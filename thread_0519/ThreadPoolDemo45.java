package thread.thread_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-19
 * Time: 19:35
 */
public class ThreadPoolDemo45 {
    public static void main(String[] args) {



            //船舰固定个数的线程池
            ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i <10 ; i++) {
            //设置任务①，执行
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名" + Thread.currentThread().getName());
                }
            });

        }

    }
}

