package com.AlgorithmsAndDataStructures.BinarySearchTree;


/**
 * @author lubiao
 * @createDate 2018年08月08日 上午 09:36:00
 */
public class Node {
    private int key;
    private int value;

    private Node leftChild;
    private Node rightChild;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
