package chapter_four.text49_5;

/**
 * Data:2021/9/14
 * Time:15:23
 * Author:hgw
 * Description:
 */
public class DiagramChartFactory implements  ChartFactory{  //具体工厂角色
    @Override
    public Chart createChart() {
        Chart chart = new Diagram();
        return chart;
    }
}
