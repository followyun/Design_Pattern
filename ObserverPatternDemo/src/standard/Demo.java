package standard;

/**
 */
public class Demo {
    public static void testObserver() {

        CarObservable observable = new CarObservable();
        observable.addObserver(new DriverObserver());//添加观察者
        observable.addObserver(new PoliceObserver());//添加观察者

        observable.setData("发生车祸");
    }
}
