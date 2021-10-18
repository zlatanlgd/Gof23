package cn.uestc.factory.method;

public class TeslaFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Tesla();
    }
}
