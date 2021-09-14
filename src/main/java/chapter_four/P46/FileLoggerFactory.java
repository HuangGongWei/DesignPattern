package chapter_four.P46;

/**
 * Data:2021/9/14
 * Time:15:01
 * Author:hgw
 * Description:
 */
public class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        System.out.println("创建文件");
        return logger;
    }
}
