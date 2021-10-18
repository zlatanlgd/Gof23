package cn.uestc.single;

/**
 * @ClassName: Holder
 * @Author: Lrc
 * @Date: 2021-10-18 11:12
 * @Description: 静态内部类实现
 */
public class Holder {

    private Holder(){

    }
    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }
    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}
