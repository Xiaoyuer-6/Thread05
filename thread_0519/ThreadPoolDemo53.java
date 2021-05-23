package thread.thread_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-19
 * Time: 21:08
 */
//根据当前工作环境创建
public class ThreadPoolDemo53 {
    public static void main(String[] args) {

        ExecutorService service = Executors.newWorkStealingPool();
        for (int i = 0; i < 10; i++) {


            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("" + Thread.currentThread().getName());
                }
            });
        }
        //等待异步线程池
        while (!service.isTerminated()){

        }
    }
}
