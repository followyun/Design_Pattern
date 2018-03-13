package my;

/**
 * 被观察者
 */
public interface BaseClient {

    /**'
     * 改变状态
     */
    void changeStatus();

    /**
     * 状态是否变化
     * @return
     */
    boolean isChange();
}
