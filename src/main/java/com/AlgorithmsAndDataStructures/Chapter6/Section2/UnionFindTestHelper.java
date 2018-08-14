package com.AlgorithmsAndDataStructures.Chapter6.Section2;

import com.AlgorithmsAndDataStructures.Chapter6.Section3.UnionFind2;
import com.AlgorithmsAndDataStructures.Chapter6.Section4.UnionFind3;
import com.AlgorithmsAndDataStructures.Chapter6.Section5.UnionFind4;
import com.AlgorithmsAndDataStructures.Chapter6.Section6.UnionFind5;

/**
 * @author lubiao
 * @createDate 2018年08月13日 上午 11:25:00
 */
public class UnionFindTestHelper {

    // 测试第一版本的并查集, 测试元素个数为n
    public static void testUF1( int n ){

        UnionFind1 uf = new UnionFind1(n);

        long startTime = System.nanoTime();

        // 进行n次操作, 每次随机选择两个元素进行合并操作
        for( int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.unionElements(a,b);
        }
        // 再进行n次操作, 每次随机选择两个元素, 查询他们是否同属一个集合
        for(int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime = System.nanoTime();

        // 打印输出对这2n个操作的耗时
        System.out.println("UF2, " + 2*n + " ops, " + (double)(endTime-startTime)/1000000000 + "s");
    }

    // 测试第二版本的并查集, 测试元素个数为n, 测试逻辑和之前是完全一样的
    // 思考一下: 这样的冗余代码如何消除?
    // 由于这个课程不是设计模式课程, 在这里就不过多引入相关的问题讲解了。留作给大家的思考题:)
    public static void testUF2( int n ){

        UnionFind2 uf = new UnionFind2(n);

        long startTime = System.nanoTime();

        // 进行n次操作, 每次随机选择两个元素进行合并操作
        for( int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.unionElements(a,b);
        }
        // 再进行n次操作, 每次随机选择两个元素, 查询他们是否同属一个集合
        for(int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime = System.nanoTime();

        // 打印输出对这2n个操作的耗时
        System.out.println("UF2, " + 2*n + " ops, " + (double)(endTime-startTime)/1000000000 + "s");
    }


    public static void testUF3( int n ){

        UnionFind3 uf = new UnionFind3(n);

        long startTime = System.nanoTime();

        // 进行n次操作, 每次随机选择两个元素进行合并操作
        for( int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.unionElements(a,b);
        }
        // 再进行n次操作, 每次随机选择两个元素, 查询他们是否同属一个集合
        for(int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime = System.nanoTime();

        // 打印输出对这2n个操作的耗时
        System.out.println("UF3, " + 2*n + " ops, " + (double)(endTime-startTime)/1000000000 + "s");
    }


    public static void testUF4( int n ){

        UnionFind4 uf = new UnionFind4(n);

        long startTime = System.nanoTime();

        // 进行n次操作, 每次随机选择两个元素进行合并操作
        for( int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.unionElements(a,b);
        }
        // 再进行n次操作, 每次随机选择两个元素, 查询他们是否同属一个集合
        for(int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime = System.nanoTime();

        // 打印输出对这2n个操作的耗时
        System.out.println("UF4, " + 2*n + " ops, " + (double)(endTime-startTime)/1000000000 + "s");
    }


    public static void testUF5( int n ){

        UnionFind5 uf = new UnionFind5(n);

        long startTime = System.nanoTime();

        // 进行n次操作, 每次随机选择两个元素进行合并操作
        for( int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.unionElements(a,b);
        }
        // 再进行n次操作, 每次随机选择两个元素, 查询他们是否同属一个集合
        for(int i = 0 ; i < n ; i ++ ){
            int a = (int)(Math.random()*n);
            int b = (int)(Math.random()*n);
            uf.isConnected(a,b);
        }
        long endTime = System.nanoTime();

        // 打印输出对这2n个操作的耗时
        System.out.println("UF5, " + 2*n + " ops, " + (double)(endTime-startTime)/1000000000 + "s");
    }

}
