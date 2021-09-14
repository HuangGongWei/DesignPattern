package chapter_four.P46;

import sun.rmi.runtime.Log;

/**
 * Data:2021/9/14
 * Time:15:01
 * Author:hgw
 * Description:
 */
public class DatabaseLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        System.out.println("连接数据库");
        System.out.println("创建数据库日志记录对象");
        Logger logger = new DatabaseLogger();
        System.out.println("初始化数据库日志记录器");
        return logger;
    }
}
