package com.AlgorithmsAndDataStructures.Sort.Sort3.Sort3_1_MergeSort;

import com.AlgorithmsAndDataStructures.Sort.Sort2.Sort2_3.SortTestHelper;

import java.util.Arrays;

/**自顶向下的归并排序
 * @author lubiao
 * @createDate 2018年08月10日 下午 03:05:00
 */
public class MergeSort {

    public static void mergeSort(Comparable[] arr){
        mergeSort(arr , 0 , arr.length-1);
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
        System.out.println("自顶向下的归并排序耗时：" + (double)(end1 - start1)/1000 + " ");
    }
}
