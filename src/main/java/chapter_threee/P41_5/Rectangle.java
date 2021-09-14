package chapter_threee.P41_5;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

    @Override
    public void erase() {
        System.out.println("擦除矩形");
    }
}
