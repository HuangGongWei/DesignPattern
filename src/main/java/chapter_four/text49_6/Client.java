package chapter_four.text49_6;

import chapter_four.text49_5.Chart;
import chapter_four.text49_5.ChartFactory;
import chapter_four.text49_5.HistpgramChartFactory;

/**
 * Data:2021/9/14
 * Time:15:25
 * Author:hgw
 * Description:
 */
public class Client {
    public static void main(String[] args) {    //客户测试类
        DataConversionFactory factory;
        DataConversion dataConversion;
        factory = new TxtToXmlFactorty();
        dataConversion = factory.createDataConversion();
        dataConversion.dataConversionToXml();
    }
}
