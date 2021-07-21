package cn.bhy.singleton;

/**
 * 枚举单例
 *     特点：利用枚举类型的特点得到的实例都是唯一且线程安全的。
 *          枚举类的属性是通过static final修饰的，枚举类加载时会被初始化。
 */
public enum Mgr04 {
    INSTANCE;

    public static void main(String[] args) {
        for(int i =0; i < 100; i++){
            new Thread(()->{
                System.out.println(Mgr04.INSTANCE.hashCode());
            }).start();
        }
    }
}
