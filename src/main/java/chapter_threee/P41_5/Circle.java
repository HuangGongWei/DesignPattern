package chapter_threee.P41_5;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("创建圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
