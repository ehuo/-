package cn.bhy.strategy;

import java.util.Comparator;

/**
 * 排序类
 * 不同comparator 比较时调用各自实现的方法
 */
public class Sorter<T> {

    /**
     * 通过指定排序类型对数据进行排序
     * @return 排序结果
     */
    public T[] sort(T[] arr, Comparator<T> comparator){
        for(int i =0; i < arr.length; i++){
            int minPos = i;
            for(int j = i + 1; j<arr.length; j++){
                minPos = comparator.compare(arr[j],arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
        return null;
    }

    /**
     * 数组值交换
     * @param arr 数组
     * @param i 值1
     * @param j 值2
     */
    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
