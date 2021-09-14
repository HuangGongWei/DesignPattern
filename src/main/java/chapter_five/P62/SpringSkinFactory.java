package chapter_five.P62;

/**
 * Data:2021/9/14
 * Time:16:13
 * Author:hgw
 * Description:
 */
public class SpringSkinFactory implements SkinFactory{  //Spring皮肤工厂，充当具体工厂
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
