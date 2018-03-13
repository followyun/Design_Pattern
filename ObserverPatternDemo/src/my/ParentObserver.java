package my;

/**
 */
public class ParentObserver implements BaseObserver{
    @Override
    public void advice() {
        System.out.println("通知【家长】：孩子状态发生变化");
    }
}
