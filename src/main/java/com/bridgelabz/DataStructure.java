package com.bridgelabz;


public class DataStructure {
    public static void main(String[] args) {
        System.out.println("Welcome to the data structure program(linked list)");
        MyNode<Integer>myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer>mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer>myThirdNode = new MyNode<Integer>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
    }
}