package com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_3;

/**
 * @author lubiao
 * @createDate 2018年08月09日 下午 04:09:00
 */
public class SelectionSort {

    private SelectionSort() {}

    public static void selectionSort(Comparable[] arr){
        for(int i = 0; i < arr.length; i++){
            //寻找[i,n)区间里的最小值
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

    }

    private static void swap(Object[] arr, int i, int minIndex) {
        Object temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

    }



    public static void main(String[] args) {
        int n = 100;
        Integer[] arr = SortTestHelper.generateRandomArray(n,0,n);
        System.out.print("排序前：");
        SortTestHelper.printArray(arr);
        SelectionSort.selectionSort(arr);
        System.out.print("\n排序后：");
        SortTestHelper.printArray(arr);

    }
}
