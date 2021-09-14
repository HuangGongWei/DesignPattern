package chapter_four.text49_6;

/**
 * Data:2021/9/14
 * Time:15:36
 * Author:hgw
 * Description:
 */
public class TxtToXmlFactorty implements DataConversionFactory {
    @Override
    public DataConversion createDataConversion() {
        System.out.println("引入配置文件");
        DataConversion dataConversion = new TxtToXml();
        return dataConversion;
    }
}
