package thread.thread_0523;

import java.net.DatagramPacket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 15:29
 */
public class ThreadPoolDemo73 {
    static ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("mm:ss"));

    public static void main(String[] args) {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,new LinkedBlockingDeque<>(1000)
//        );
//        for (int i = 0; i <1001 ; i++) {
//            int finalI = i;
//            executor.execute(new Runnable() {
//                @Override
//                public void run() {
//                    Date data = new Date(finalI+1000);
//                    myFormat(date);
//                }
//            });
//        }
//    }

    }
}
