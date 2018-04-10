package my;

/**
 */
public class MyDemo {
    public static void useTest() {

        CompositeComputer computer = new CompositeComputer();
        Computer computer0 = new Computer0();
        Computer computer1 = new Computer1();
        Computer computer2 = new Computer2();

        computer.addAll(computer0, computer1, computer2);
        computer.shutdown();
    }
}
