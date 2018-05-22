package Stacks;

public class StackOverflowException extends Exception {

    public StackOverflowException() {
        System.out.println("The stack is full!");
    }
}
