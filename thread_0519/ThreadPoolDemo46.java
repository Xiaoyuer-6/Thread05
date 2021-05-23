package thread.thread_0519;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-19
 * Time: 19:54
 */
public class ThreadPoolDemo46 {
    public static void main(String[] args) {
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i <10 ; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名" + Thread.currentThread().getName()+"线程名" + Thread.currentThread().getPriority());
                }
            });

        }
    }
    static  class  MyThreadFactory implements ThreadFactory{
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread();
            //设置线程池的命名
            //thread.setName("myThreadPool"+ count ++);

            thread.setPriority(10);
            return thread;
        }

    }


}
