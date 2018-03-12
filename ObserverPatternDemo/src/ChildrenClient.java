/**
 */
public class ChildrenClient extends Subject implements BaseClient {

    private Boolean status = false;

    @Override
    public void changeStatus() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (status) {
            status = true;
            System.out.println("【孩子】:孩子状态发生变化！status = " + status);
        }
    }

    @Override
    public synchronized boolean isChange() {
        return status;

    }
}
