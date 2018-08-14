package com.AlgorithmsAndDataStructures.Sort.Sort3.Sort3_4_QuickSort;

import com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_3.SortTestHelper;

/**
 * @author lubiao
 * @createDate 2018年08月13日 上午 08:54:00
 */
public class QuickSort {

    // 我们的算法类不允许产生任何实例
    private QuickSort(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        sort(arr,0,n-1);
    }

    private static int position(Comparable[] arr, int l, int r){
        Comparable v = arr[l];
        int j = l;
        for(int i = l+1;i<=r;i++){
            if(arr[i].compareTo(v)<0){
                swap(arr, j+1 , i);
                j++;
            }
        }
        swap(arr,l,j);
        return j;
    }


    private static  void sort(Comparable[] arr, int l, int r){
        if(l>=r){
            return;
        }
        int p = position(arr,l,r);
        sort(arr,l,p-1);
        sort(arr, p+1, r);
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // 测试 QuickSort
    public static void main(String[] args) {

        // Quick Sort也是一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        int N = 1000000;
        //Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        Integer[] arr = {8,5,7,6,4,3,9};
        long start1 = System.currentTimeMillis();
        sort(arr);
        long end1 = System.currentTimeMillis();
        System.out.println("快速排序耗时：" + (double)(end1 - start1)/1000 + " ");
    }
}
