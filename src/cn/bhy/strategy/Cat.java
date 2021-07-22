package cn.bhy.strategy;

/**
 *  定义Cat类
 */
public class Cat {

    //身高
    private int height;
    //年龄
    private int age;

    public Cat(int height, int age) {
        this.height = height;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", age=" + age +
                '}';
    }
}
