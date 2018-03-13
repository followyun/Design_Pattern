package my;

public class TeacherObserver implements BaseObserver {
    @Override
    public void advice() {
        System.out.println("通知【老师】：孩子状态发生变化！");
    }
}
