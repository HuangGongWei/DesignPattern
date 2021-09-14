package chapter_threee.P41_5;

public class Client {
    public static void main(String[] args) {
        Shape shape;
        shape = ShapeFactory.getShape("circle");    //  通过静态工厂方法创建产品
        shape.draw();
        shape.erase();
    }
}
