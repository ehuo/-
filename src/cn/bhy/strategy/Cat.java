package cn.bhy.strategy;


public class Cat implements Comparable<Cat>{
    private int height;
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
    public int compareTo(Cat o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", age=" + age +
                '}';
    }
}
