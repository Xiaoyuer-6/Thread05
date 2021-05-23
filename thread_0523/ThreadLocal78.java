package thread.thread_0523;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-23
 * Time: 16:47
 */
public class ThreadLocal78 {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        t1.start();
        MyTask t2 = new MyTask();
        t2.start();
    }
    static class MyTask extends Thread{

        static boolean first = true;//标识是否第一次访问；


        @Override
        public void run() {
            if (first){
                threadLocal.set(this.getName()+"session info");
            }
            String result = threadLocal.get();
            System.out.println(this.getName()+","+result);
        }
    }
}
