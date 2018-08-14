package com.AlgorithmsAndDataStructures.BinarySearchTree;

/**
 * @author lubiao
 * @createDate 2018年08月08日 上午 10:36:00
 */
public class TestDemo {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4,4);
        bst.insert(6,6);
        bst.insert(5,5);
        bst.insert(2,2);
        bst.insert(3,3);
        bst.insert(7,7);
        bst.insert(1,1);

        bst.remove(2);

        System.out.println("最大值："+bst.getMammum());
        System.out.println("最小值："+bst.getMinmum());


        System.out.print("层序遍历：");
        bst.levelOrder();
        System.out.println();

        System.out.print("先序遍历：");
        bst.perTravelsal();
        System.out.println();
        System.out.print("中序遍历：");
        bst.inorTravelsal();
        System.out.println();
        System.out.print("后序遍历：");
        bst.postTarvelsal();
        System.out.println();



    }


}
