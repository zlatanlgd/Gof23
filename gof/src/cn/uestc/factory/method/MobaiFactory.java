package cn.uestc.factory.method;

public class MobaiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
