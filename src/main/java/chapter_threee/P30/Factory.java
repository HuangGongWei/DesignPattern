package chapter_threee.P30;

public class Factory {
    //静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            //初始化设置product
        }else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            //初始化设置product
        }
        return product;
    }

    private static class ConcreteProductA extends Product {
        @Override
        public void methodDiff() {
            System.out.println("A");
        }
    }

    private static class ConcreteProductB extends Product {
        @Override
        public void methodDiff() {
            System.out.println("B");
        }
    }
}
