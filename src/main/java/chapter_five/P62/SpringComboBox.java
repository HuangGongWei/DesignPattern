package chapter_five.P62;

/**
 * Data:2021/9/14
 * Time:16:09
 * Author:hgw
 * Description:
 */
public class SpringComboBox implements ComboBox{    //Spring组合框类，充当具体产品
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框");
    }
}
