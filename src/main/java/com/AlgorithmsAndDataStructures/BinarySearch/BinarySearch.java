package com.AlgorithmsAndDataStructures.BinarySearch;

/**
 * 二分查找
 * @author lubiao
 * @createDate 2018年08月07日 下午 04:04:00
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] test = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(test,8));
        System.out.println(recursionBinarySearch(test,8,0,test.length-1));

        int int1 = 2147483640;
        int int2 = 2147483647;

        int mm = (int1 + int2) / 2;
        int mm2 = int1 + (int2 - int1)/2;
        System.out.println(mm);
        System.out.println(mm2);
    }

    /**
     * 非递归法二分查找
     * @param arr 需要查找的数组（有序的）
     * @param target 查找的目标
     * @return 返回查找的目标的索引
     */
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while( left <= right){
            //int mid = (left + right)/2;
            int mid = left + (right - left)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int recursionBinarySearch(int[] arr, int target, int left, int right){
        int mid = left + (right - left) / 2;
        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return recursionBinarySearch(arr,target,left,mid-1);
        }
        if(target > arr[mid]){
            return recursionBinarySearch(arr,target,mid + 1,right);
        }
        return -1;
    }
}
