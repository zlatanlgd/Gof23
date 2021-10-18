package cn.uestc.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        //需要了解接口，以及所有的实现类
//        Car car = new WuLing();
//        Car car2 = new Tesla();

        //2. 使用工厂创建
        Car car = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");
        car.name();
        car2.name();
    }
}
