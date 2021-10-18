package cn.uestc.factory.simple;

//静态工厂模式
//增加一个新的产品，如果不修改代码做不到。

//开闭原则
public class CarFactory {
    //方法一
    public static Car getCar(String car) {
        if (car.equals("五菱")) {
            return new WuLing();
        } else if (car.equals("特斯拉")) {
            return new Tesla();
        } else {
            return null;
        }
    }
    //方法二

    public static Car getWulin() {
        return new WuLing();
    }

    public static Car getTesla() {
        return new Tesla();
    }
}
