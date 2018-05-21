package com.company;

import java.util.concurrent.atomic.AtomicLongArray;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Node<T extends Comparable<T>>{
    private T data;
    private Node<T> next;

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T data) {
        this.data = data;
        setNext(null);
    }

    @Override
    public String toString(){
        return String.valueOf(data);
    }

}

