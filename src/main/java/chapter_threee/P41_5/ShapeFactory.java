package chapter_threee.P41_5;

public class ShapeFactory {
    //静态工厂方法
    public static Shape getShape(String type) {
        Shape shape = null;
        try {
            if (type.equalsIgnoreCase("circle")) {
                shape = new Circle();
                System.out.println("初始化设置圆形！");
            } else if (type.equalsIgnoreCase("triangle")) {
                shape = new Triangle();
                System.out.println("初始化设置矩形！");
            }else if (type.equalsIgnoreCase("rectangle")) {
                shape = new Rectangle();
                System.out.println("初始化设置三角形！");
            }
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        return shape;
    }

}
