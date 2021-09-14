package chapter_five.P62;

/**
 * Data:2021/9/14
 * Time:16:11
 * Author:hgw
 * Description:
 */
public interface SkinFactory {      //界面皮肤工厂接口，充当抽象工厂
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
