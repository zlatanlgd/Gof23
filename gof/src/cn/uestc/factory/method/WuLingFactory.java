package cn.uestc.factory.method;

import cn.uestc.factory.method.Car;
import cn.uestc.factory.method.CarFactory;
import cn.uestc.factory.method.WuLing;

public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
