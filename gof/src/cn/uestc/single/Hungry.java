package cn.uestc.single;

/**
 * @ClassName: Hungry
 * @Author: Lrc
 * @Date: 2021-10-18 10:35
 * @Description: 单例模式——饿汉式
 */
public class Hungry {


    // 可能会浪费空间
    private byte[] data1 = new byte[1024 * 1024 * 1024];
    private byte[] data2 = new byte[1024 * 1024 * 1024];
    private byte[] data3 = new byte[1024 * 1024 * 1024];
    private byte[] data4 = new byte[1024 * 1024 * 1024];

    private Hungry() {
    }

    private final static Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }


}
