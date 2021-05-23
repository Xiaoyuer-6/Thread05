package thread.thread_0523;

import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 15:16
 */
public class ThreadPoolDemo70 {
    static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(new Supplier<String>() {
        @Override
        public String get() {
            //return null;
            System.out.println("执行了初始化的方法");
            return "java";

        }
    });

    public static void main(String[] args) {
        String result =  threadLocal.get();
        System.out.println("结果"+result);

    }
}
