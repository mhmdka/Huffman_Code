package com.company;

public class Node {
    private Node left;
    private Node right;
    private Node father;
    private char name;
    private int count;
    private int linkToFather;

    public Node(){
        setCount(0);
        setFather(null);
        setLeft(null);
        setRight(null);
        setLinkToFather(0);
        setName('-');
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setName(char name) {
        this.name = name;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public void setLinkToFather(int linkToFather) {
        this.linkToFather = linkToFather;
    }

    public int getLinkToFather() {
        return linkToFather;
    }

    public int getCount() {
        return count;
    }

    public Node getFather() {
        return father;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public char getName() {
        return name;
    }
}
