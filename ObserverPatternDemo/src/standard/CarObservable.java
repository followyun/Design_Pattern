package standard;

import java.util.Observable;

/**
 * 被观察者（汽车）
 */
public class CarObservable extends Observable{
    public void setData(String data){
        setChanged();//设置被观察者状态已改变
        notifyObservers(data);//通知所有观察者
    }
}
