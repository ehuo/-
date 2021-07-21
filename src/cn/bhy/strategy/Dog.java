package cn.bhy.strategy;

/**
 *  实现 Comparable 泛型控制比较种类
 */
public class Dog  implements Comparable<Dog>{
   private int food;

   @Override
   public int compareTo(Dog o) {
      return 0;
   }
}
