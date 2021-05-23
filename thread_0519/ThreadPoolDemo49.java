package thread.thread_0519;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-19
 * Time: 20:43
 */
//  比起48的没有延迟执行的时间设置，定时任务只能执行一次。
public class ThreadPoolDemo49 {
    public static void main(String[] args) {
        ScheduledExecutorService service =
                Executors.newScheduledThreadPool(10);
        System.out.println(""+new Date());
        service.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(""+new Date());

            }
        },3, TimeUnit.SECONDS);//固定周期定时延迟
        //参数1：线程池的任务，参数2：定时任务延迟多长时间开始执行 参数3：
    }
}
