package standard;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者（司机）
 */
public class DriverObserver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("【司机】收到"+arg+",紧急刹车！");
    }
}
