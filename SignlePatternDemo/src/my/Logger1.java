package my;

/**
 * 单例模式
 * 懒汉方式（懒加载）
 * 非线程安全
 */
public class Logger1 {
    private static Logger1 logger;

    private Logger1() {

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

    public static  Logger1 getLogger() {
        if (logger == null) {
            logger = new Logger1();
        }
        return logger;
    }
}
