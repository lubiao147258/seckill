package com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_1.SelectionSort;

/**
 * @author lubiao
 * @createDate 2018年08月09日 下午 04:09:00
 */
public class SelectionSort {

    private SelectionSort() {}

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //寻找[i,n)区间里的最小值
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
            System.out.println();
            System.out.print("第"+(i+1)+"趟排序后的结果：");
            print(arr);

        }

    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

    }

    private static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {8,5,7,6,4,3,9};
        System.out.print("排序前：");
        print(arr);
        SelectionSort.selectionSort(arr);
        System.out.print("\n排序后：");
        print(arr);
    }
}
