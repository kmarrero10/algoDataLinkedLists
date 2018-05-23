package linkedLists;

import Stacks.*;
import Stacks.Stack;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MinimumStack stack = new MinimumStack();

        try {

            stack.push(8);
            stack.push(9);
            System.out.println(stack.getMinimum());
            stack.push(7);
            System.out.println(stack.getMinimum());
        } catch (Exception e) {

        }

//        try {
//            stack.push(3);
//            stack.push(4);
//            stack.push(5);
//            stack.push(6);
//            stack.pop();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        try {
//            System.out.println(stack.peek());
//        } catch (Exception e){
//
//        }
//        System.out.println(stack.isFull() );
    }

}

