package chapter_four.P46;

/**
 * Data:2021/9/14
 * Time:14:57
 * Author:hgw
 * Description:
 */
public class DatabaseLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
