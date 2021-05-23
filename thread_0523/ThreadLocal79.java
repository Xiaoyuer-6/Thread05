package thread.thread_0523;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 16:47
 */
public class ThreadLocal79 {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,0, TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000));
        for (int i = 0; i <2 ; i++) {
            MyTask t = new MyTask();
          executor.execute(t);
        }

    }
    static class MyTask extends Thread{

        static boolean first = true;//标识是否第一次访问；

        @Override
        public void run() {
            if (first){
                threadLocal.set(this.getName()+"session info");
            }
            first = false;
            String result = threadLocal.get();
            System.out.println(this.getName()+","+result);
        }
    }

}
