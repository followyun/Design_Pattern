package my;

/**
 */
public class Computer2 implements Computer{
    @Override
    public void shutdown() {
        System.out.println(this.getClass().getSimpleName()+" shutdown...");
    }
}
