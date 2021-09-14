package chapter_five.P62;

/**
 * Data:2021/9/14
 * Time:16:03
 * Author:hgw
 * Description:
 */
public class SpringButton implements Button {   //Spring按钮类，充当具体产品类
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
