package chapter_four.text49_4;

/**
 * Data:2021/9/14
 * Time:15:16
 * Author:hgw
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory;
        Car car;
        factory = new BmwCarFactory();
        car = factory.createCar();
        car.buildCar();
    }
}
