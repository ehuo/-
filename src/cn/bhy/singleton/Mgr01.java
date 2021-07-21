package cn.bhy.singleton;

/**
 *  饿汉式
 *  特点：1.构造方法私有化，静态常量保存唯一事例，通过静态方法提供实例。
 *       类加载到内存后即创建实例，并只能创建一个实例，由JVM控制线程安全
 *  缺点：不用使用与否，类加载时都会创建一个实例。
 *  简单实用 --> 推荐
 */

public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01(){};

    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01 == mgr02);
    }
}
