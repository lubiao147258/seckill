package com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_5.InsertionSort;

import com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_3.SelectionSort;
import com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_3.SortTestHelper;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * 插入排序
 * @author lubiao
 * @createDate 2018年08月10日 上午 10:46:00
 */
public class InsertionSort {

    public static void sort(Comparable[] arr){
        int n = arr.length;

        for(int i = 1; i<n;i++){

            //写法1、条件合并
            /*for(int j = i ; j > 0 && arr[j].compareTo(arr[j-1]) < 0;j--){
                swap( arr , j, j-1);
            }
            System.out.print("第"+(i)+"趟排序后的结果：");
            SortTestHelper.printArray(arr);*/


            //写法2
            Comparable e = arr[i];
            int j = i;
            for( ; j > 0 && arr[j-1].compareTo(e) > 0 ; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
            System.out.print("第"+(i)+"趟排序后的结果：");
            SortTestHelper.printArray(arr);
        }


    }

    // 对arr[l...r]的区间使用InsertionSort排序
    public static void sort(Comparable[] arr, int l, int r){

        for( int i = l + 1 ; i <= r ; i ++ ){
            Comparable e = arr[i];
            int j = i;
            for( ; j > l && arr[j-1].compareTo(e) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = e;
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int n = 10;
//        Integer[] arr = SortTestHelper.generateRandomArray(n,0,n);
        Integer[] arr = SortTestHelper.generateNearlyOrderedArray(n,n);
        SortTestHelper.printArray(arr);
        long start = System.currentTimeMillis();
        sort(arr);
        long end = System.currentTimeMillis();
        //SortTestHelper.printArray(arr);
        System.out.println("插入排序耗时：" + (end - start) + " ms");

       /* Long start1 = System.currentTimeMillis();
        SelectionSort.selectionSort(arr);
        Long end1 = System.currentTimeMillis();
        //SortTestHelper.printArray(arr);
        System.out.println("选择排序耗时：" + (end1 - start1) + " ms");*/
    }
}
