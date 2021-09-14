package chapter_five.P62;

/**
 * Data:2021/9/14
 * Time:16:06
 * Author:hgw
 * Description:
 */
public class SpringTextField  implements TextField{     //Spring文本框类，充当具体产品类
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }

}
