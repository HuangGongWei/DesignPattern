package chapter_four.text49_6;

/**
 * Data:2021/9/14
 * Time:15:29
 * Author:hgw
 * Description:
 */
public class TxtToXml implements DataConversion{    //具体产品角色
    @Override
    public void dataConversionToXml() {
        System.out.println("TXT数据文件转换成XML格式");
    }

    @Override
    public void init() {
        System.out.println("数据格式转换工具初始化");
    }
}
