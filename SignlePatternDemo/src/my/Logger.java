package my;

/**
 * 单例模式
 * 懒汉方式（懒加载）
 * 线程安全
 */
public class Logger {
    private static Logger logger;

    private Logger() {

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

    public static synchronized Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
