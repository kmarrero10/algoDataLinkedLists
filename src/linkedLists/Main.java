package linkedLists;

import Stacks.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<Integer>();

        try {
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(stack.peek());
        } catch (Exception e){

        }
    }
}

