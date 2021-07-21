package cn.bhy.singleton;

/**
 * 懒汉式
 *      特点：构造方法私有化，静态变量初始值为null，使用实例时才进行初始化
 *      缺点：因为是在程序运行过程中进行判断静态变量，所以会造成线程安全问题
 *      线程安全解决方案：获取实例方法通过 synchronized 修饰，锁定Mgr02.class
 *          缺点：影响效率，对象只能被单线程使用
 */
public class Mgr02 {
    public static volatile Mgr02 INSTANCE = null;

    private Mgr02(){};

    public static Mgr02 getInstance(){
        if(INSTANCE == null){
        synchronized(Mgr02.class){
            if(INSTANCE == null){
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr02();
            }
        }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for(int i =0; i < 100; i++){
            new Thread(()->{
                System.out.println(Mgr02.getInstance().hashCode());
            }).start();
        }
    }
}
