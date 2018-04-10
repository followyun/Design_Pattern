package my;

/**
 */
public class Computer0 implements Computer{
    @Override
    public void shutdown() {
        System.out.println(this.getClass().getSimpleName()+" shutdown...");
    }
}
