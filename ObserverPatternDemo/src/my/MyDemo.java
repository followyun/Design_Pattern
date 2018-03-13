package my;

import java.util.concurrent.*;

/**
 */
public class MyDemo {
    public static void demo1(){
        ChildrenClient client = new ChildrenClient();//创建客户端
        BaseObserver observer = new TeacherObserver();//创建观察者老师
        BaseObserver observer1 = new ParentObserver();//创建观察者父母
        Subject subject = new Subject();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                client.changeStatus();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();//新线程中执行客户端状态
        subject.addObserver(observer);//添加观察者
        subject.addObserver(observer1);//添加观察者
        subject.observeClient(client);//监控客户端状态是否有变化，并通知观察者
    }

    /**
     *通过FutureTask新开线程执行任务，并返回结果
     */
    public static void demo2(){
        System.out.println("【主线程：】"+Thread.currentThread().getId());
        BaseClient client = new ChildrenClient();
        BaseObserver observer = new ParentObserver();
        Subject subject = new Subject();
        subject.addObserver(observer);
        Callable<Boolean> callable = new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("【客户端线程：】"+Thread.currentThread().getId());
                client.changeStatus();
                return Boolean.TRUE;
            }
        };
        FutureTask<Boolean> task = new FutureTask(callable);
        Thread thread = new Thread(task);
        thread.start();

        try {
            boolean flag =  task.get(2, TimeUnit.SECONDS);
            if(flag){
                subject.notifyAllObserver();//通知所有客户端
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("等待线程执行结束返回超时");
            e.printStackTrace();
        }

    }
}
