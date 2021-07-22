package cn.bhy.strategy;

import java.util.Comparator;

/**
 *  Cat对象比较年龄
 *  泛型限定当前比较类只允许进行Cat类型比较
 */
public class CatAgeComparator implements Comparator<Cat> {

    /**
     * 比较Cat类的age属性  年龄大的排名靠后
     * @param o1 对象1
     * @param o2 对象2
     * @return
     */
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getAge() > o2.getAge()) return 1;
        else if (o1.getAge() < o2.getAge()) return -1;
        else return 0;
    }
}
