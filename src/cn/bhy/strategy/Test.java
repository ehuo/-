package cn.bhy.strategy;

import java.util.Arrays;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        Cat[] cat = new Cat[]{new Cat(5,6), new Cat(2,3), new Cat(4,7)};
        Sorter<Cat> sorter = new Sorter<Cat>();
        sorter.sort(cat, new CatComparator());
        System.out.println(Arrays.toString(cat));
    }
}
