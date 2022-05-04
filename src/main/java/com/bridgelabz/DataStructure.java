package com.bridgelabz;

public class DataStructure {
    public static void main(String[] args) {
        System.out.println("Welcome to the data structure program(linked list");
        addInBetween();
    }

    private static void addInBetween() {
        MyNode<Integer>myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer>mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer>myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNode();
    }

    private static void addAtLast() {
        MyNode<Integer>myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer>mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer>myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
    }

    private static void addAtFirst() {
        MyNode<Integer>myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer>mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer>myThirdNode = new MyNode<Integer>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
    }
}