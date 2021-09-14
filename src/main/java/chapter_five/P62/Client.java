package chapter_five.P62;

/**
 * Data:2021/9/14
 * Time:19:22
 * Author:hgw
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = new SpringSkinFactory();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();

        bt.display();
        tf.display();
        cb.display();
    }
}
