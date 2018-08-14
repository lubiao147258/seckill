package com.AlgorithmsAndDataStructures.Chapter6.Section2;

/**
 * @author lubiao
 * @createDate 2018年08月13日 上午 11:24:00
 */
public class Main {
    public static void main(String[] args) {
        int n = 10000;

        // 虽然isConnected只需要O(1)的时间, 但由于union操作需要O(n)的时间
        // 总体测试过程的算法复杂度是O(n^2)的
        UnionFindTestHelper.testUF1(n);
    }
}
