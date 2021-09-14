package chapter_four.text49_4;

/**
 * Data:2021/9/14
 * Time:15:15
 * Author:hgw
 * Description:
 */
public class BenzCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        Car car = new Benz();
        return car;
    }
}
