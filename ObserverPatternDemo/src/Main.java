public class Main {

    public static void main(String[] args) {
        ChildrenClient client = new ChildrenClient();
        BaseObserver observer = new TeacherObserver();
        Subject subject = new Subject();
        subject.addObserver(observer);
        subject.observeClient(client);
    }
}
