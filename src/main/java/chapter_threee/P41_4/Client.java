package chapter_threee.P41_4;

import chapter_threee.P41_5.Shape;
import chapter_threee.P41_5.ShapeFactory;

public class Client {
    public static void main(String[] args) {
        Nvwa nvwa;
        nvwa = PersonFactory.getNvwa("M");   //  通过静态工厂方法创建产品
        nvwa.Person();
    }
}
