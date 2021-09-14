package chapter_five.P62;

/**
 * Data:2021/9/14
 * Time:16:13
 * Author:hgw
 * Description:
 */
public class SummerSkinFactory implements SkinFactory{  //Summer皮肤工厂，充当具体工厂
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
