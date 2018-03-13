package my;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Subject {
    private static List<BaseObserver> observers = new ArrayList<BaseObserver>();
    /**
     * 通知所有观察者
     */
    public void notifyAllObserver() {
        for (BaseObserver observer : observers) {
            observer.advice();
        }
    }

    /**
     * 添加观察者
     */
    public void addObserver(BaseObserver observer) {
        observers.add(observer);
    }

    /**
     * 观察客户端
     * @param client
     */
    public void observeClient(BaseClient client){
        for(;;) {
            if (client.isChange()) {
                System.out.println("发现客户端状态发生改变！开始通知所有观察者");
                notifyAllObserver();
                break;
            }
        }
    }

}
