package Stacks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Stack<T> {

    private static int MAX_SIZE = 40;

    private Element<T> top;
    private int size = 0;

    public void push(T data) throws StackOverflowException {
        if (size == MAX_SIZE) {
            throw new StackOverflowException();
        }

        Element elem = new Element(data, top);
        top = elem;
        size++;
        System.out.println("Element "+ data +" successfully pushed to top of the stack!");
    }

    public T pop() throws StackUnderflowException {
        if (size ==0) {
            throw new StackUnderflowException();
        }

        T data = top.getData();
        top = top.getNext();

        size--;
        System.out.println("Element "+ data +" successfully popped from top of the stack!");
        return data;
    }

    public T peek() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException();
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == MAX_SIZE;
    }
    public int getSize() {
        return size;
    }
    //Parenthesis validation using Map, Set, and Stack
//    private static final Map<Character, Character> matchingParenMap = new HashMap<>();
//    private static final Set<Character> openingParenSet = new HashSet<>();
//
//    static {
//        matchingParenMap.put(')', '(');
//        matchingParenMap.put(']', '[');
//        matchingParenMap.put('}', '{');
//        openingParenSet.addAll(matchingParenMap.values());
//        }

//    public static boolean hasMatchingParens(String input) {
//
//        try{
//            Stack<Character> parenStack = new Stack<>();
//            for (int i =0; i< input.length(); i++) {
//                char ch = input.charAt(i);
//                if (openingParenSet.contains(ch)) {
//                    parenStack.push(ch);
//                }
//                if (matchingParenMap.containsKey(ch)) {
//                    Character lastParen = parenStack.pop();
//                    if (lastParen!= matchingParenMap.get(ch)) {
//                        return false;
//                    }
//                }
//            }
//            return parenStack.isEmpty();
//        } catch (StackOverflowException e){
//            System.out.println(e);
//        }
//        catch (StackUnderflowException e) {
//            System.out.println(e);
//        }
//        return false;
//    }
}
