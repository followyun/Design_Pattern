package standard;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者（交警）
 */
public class PoliceObserver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("【交警】收到"+arg+",前往车祸现场救援以及舒缓交通！");
    }
}
