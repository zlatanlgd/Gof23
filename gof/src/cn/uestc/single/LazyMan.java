package cn.uestc.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: LazyMan
 * @Author: Lrc
 * @Date: 2021-10-18 10:41
 * @Description: 单例模式——懒汉式
 */
public class LazyMan {

    private static boolean flag = false;

    private LazyMan() {
        synchronized (LazyMan.class) {
            if (flag == false){
                flag =true;
            } else{
                throw new RuntimeException("不要试图用反射破坏异常");
            }
        }
        System.out.println(Thread.currentThread().getName() + "ok");
    }


    //volatile 其本身包含“禁止指令重排序”的语义
    //此处保证初始化对象保持原子性
    private volatile static LazyMan lazyMan;

    //双重检测🔒模式的懒汉式单例 DCL懒汉式
    public static LazyMan getInstance() {
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan(); //不是一个原子性操作
                }
            }
        }
        return lazyMan;
    }

    //反射破解！
    public static void main(String[] args) throws Exception{
//        LazyMan instance = LazyMan.getInstance();

        Field flag = LazyMan.class.getDeclaredField("flag");
        flag.setAccessible(true);

        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);

        LazyMan instance1 = declaredConstructor.newInstance();
        flag.set(instance1,false);
        LazyMan instance2 = declaredConstructor.newInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }

}
/**
 * 1. 分配内存空间
 * 2. 执行构造方法，初始化对象
 * 3. 把这个对象指向分配的内存空间
 * * 执行顺序无法确保123
 */
//    //多线程并发
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                lazyMan.getInstance();
//            }).start();
//        }
//    }
