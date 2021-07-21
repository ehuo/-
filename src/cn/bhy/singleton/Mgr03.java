package cn.bhy.singleton;

/**
 * 静态内部类
 *    特点：通过静态内部类的方式实现"懒加载"。Mgr03加载时不会初始化静态内部类，
 *         调用getInstance()方法时才会初始化静态内部类，此时JVM会保证线程安全并且只会产生一个实例。
 */
public class Mgr03 {

    private Mgr03(){};
    private static class Mgr03Holder{
        public static final Mgr03 INSTANCE = new Mgr03();
    }

    public static Mgr03 getInstance(){
        return Mgr03Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for(int i =0; i < 100; i++){
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
