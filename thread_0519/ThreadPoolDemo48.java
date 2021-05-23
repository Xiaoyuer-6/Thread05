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
 * Time: 20:12
 */
//任务开始执行时间是以上次任务执行结束的时间（作为延迟时间）作为开始时间的
public class ThreadPoolDemo48 {
    public static void main(String[] args) {
        ScheduledExecutorService service =
                Executors.newScheduledThreadPool(10);
        System.out.println(""+new Date());
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println(""+new Date());

            }
        },1,3, TimeUnit.SECONDS);//固定周期定时延迟
        //参数1：线程池的任务，参数2：定时任务延迟多长时间开始执行 参数3：
    }
}