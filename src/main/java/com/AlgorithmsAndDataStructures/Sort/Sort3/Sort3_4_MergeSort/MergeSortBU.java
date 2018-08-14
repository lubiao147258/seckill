package com.AlgorithmsAndDataStructures.Sort.Sort3.Sort3_4_MergeSort;

import com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_3.SortTestHelper;
import com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_5.InsertionSort.InsertionSort;

import java.util.Arrays;

/**
 * 自底向上的归并排序
 * @author lubiao
 * @createDate 2018年08月10日 下午 05:15:00
 */
public class MergeSortBU {

    // 我们的算法类不允许产生任何实例
    private MergeSortBU(){}

    public static void mergeSort(Comparable[] arr){
        int n = arr.length;
        // Merge Sort Bottom Up 无优化版本
//        for (int sz = 1; sz < n; sz *= 2)
//            for (int i = 0; i < n - sz; i += sz+sz)
//                // 对 arr[i...i+sz-1] 和 arr[i+sz...i+2*sz-1] 进行归并
//                merge(arr, i, i+sz-1, Math.min(i+sz+sz-1,n-1));

        // Merge Sort Bottom Up 优化
        // 对于小数组, 使用插入排序优化
        for( int i = 0 ; i < n ; i += 16 ) {
            InsertionSort.sort(arr, i, Math.min(i + 15, n - 1));
        }
        for( int sz = 16; sz < n ; sz += sz ) {
            for (int i = 0; i < n - sz; i += sz + sz) {
                // 对于arr[mid] <= arr[mid+1]的情况,不进行merge
                if (arr[i + sz - 1].compareTo(arr[i + sz]) > 0) {
                    merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, n - 1));
                }
            }
        }
    }

    private static void mergeSort(Comparable[] arr, int l, int r){
        if(l >= r){
            return;
        }
        int mid = l + (r - l)/2;
        mergeSort(arr, l , mid);
        mergeSort(arr, mid+1, r);
        if(arr[mid].compareTo(arr[mid+1])>0){//优化：当数组的前一个数已经比后一个数小了，此时就不用排序了，直接跳过
            merge(arr , l, mid, r);
        }
    }

    private static void merge(Comparable[] arr, int l, int mid , int r){
        Comparable[] aux = Arrays.copyOfRange(arr, l, r+1);

        // 初始化，i指向左半部分的起始索引位置l；j指向右半部分起始索引位置mid+1
        int i = l, j = mid+1;
        for( int k = l ; k <= r; k ++ ){

            if( i > mid ){  // 如果左半部分元素已经全部处理完毕
                arr[k] = aux[j-l]; j ++;
            }
            else if( j > r ){   // 如果右半部分元素已经全部处理完毕
                arr[k] = aux[i-l]; i ++;
            }
            else if( aux[i-l].compareTo(aux[j-l]) < 0 ){  // 左半部分所指元素 < 右半部分所指元素
                arr[k] = aux[i-l]; i ++;
            }
            else{  // 左半部分所指元素 >= 右半部分所指元素
                arr[k] = aux[j-l]; j ++;
            }
        }
    }

    public static void main(String[] args) {
        // Merge Sort是我们学习的第一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        // 注意：不要轻易尝试使用SelectionSort, InsertionSort或者BubbleSort处理100万级的数据
        // 否则，你就见识了O(n^2)的算法和O(nlogn)算法的本质差异：）
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, N);
        long start1 = System.currentTimeMillis();
        mergeSort(arr);
        long end1 = System.currentTimeMillis();
        System.out.println("自底向上的归并排序耗时：" + (double)(end1 - start1)/1000 + " ");
    }
}
