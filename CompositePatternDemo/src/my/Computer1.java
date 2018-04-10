package my;

/**
 */
public class Computer1 implements Computer{
    @Override
    public void shutdown() {
        System.out.println(this.getClass().getSimpleName()+" shutdown...");
    }
}
