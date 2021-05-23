package thread.thread_0523;

import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 15:16
 */
public class ThreadPoolDemo71 {
    static ThreadLocal<String> threadLocal = ThreadLocal.withInitial( ()-> "java");

    public static void main(String[] args) {
        try {


            String result = threadLocal.get();
            System.out.println("结果" + result);
        }finally {
            threadLocal.remove();//一定要写；
        }
    }
}
