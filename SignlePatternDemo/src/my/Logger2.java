package my;

/**
 * 单例模式
 * 饿汉方式
 * 线程安全
 */
public class Logger2 {
    private static Logger2 logger = new Logger2();

    private Logger2() {

    }

    public void debug(String message) {
        System.out.println(message);
    }

    public void info(String message) {
        System.out.println(message);
    }

    public void error(String message) {
        System.out.println(message);

    }

    public static Logger2 getLogger() {
        return logger;
    }
}
