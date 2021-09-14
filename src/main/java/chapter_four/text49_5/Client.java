package chapter_four.text49_5;

/**
 * Data:2021/9/14
 * Time:15:25
 * Author:hgw
 * Description:
 */
public class Client {
    public static void main(String[] args) {    //客户测试类
        ChartFactory factory;
        Chart chart;
        factory = new HistpgramChartFactory();
        chart = factory.createChart();
        chart.drawing();
    }
}
