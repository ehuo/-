package cn.bhy.strategy;

import java.util.Comparator;

/**
 * 不同比较方式采用不同实现
 */
public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getAge() > o2.getAge()) return 1;
        else if (o1.getAge() < o2.getAge()) return -1;
        else return 0;
    }
}
