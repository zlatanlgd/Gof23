package cn.uestc.single;

/**
 * @ClassName: EnumSingle
 * @Author: Lrc
 * @Date: 2021-10-18 11:28
 * @Description:
 */

//enum枚举本身也是个class类
public enum EnumSingle {
    INSTANCE;
    public EnumSingle getInstance(){
        return INSTANCE;
    }
}

class Test{
    public static void main(String[] args) {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        EnumSingle instance2 = EnumSingle.INSTANCE;
        System.out.println(instance1);
        System.out.println(instance2);
    }
}