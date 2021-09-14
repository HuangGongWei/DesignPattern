package chapter_four.P46;

/**
 * Data:2021/9/14
 * Time:15:07
 * Author:hgw
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
