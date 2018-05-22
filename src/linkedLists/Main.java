package linkedLists;

import Stacks.ParenthesisExercise;
import Stacks.Stack;
import Stacks.StackOverflowException;
import Stacks.StackUnderflowException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ParenthesisExercise parenthesisExercise = new ParenthesisExercise();

        System.out.println(parenthesisExercise.hasMatchingParens("({()})"));

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

