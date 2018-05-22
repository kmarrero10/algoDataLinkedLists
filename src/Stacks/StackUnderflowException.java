package Stacks;

public class StackUnderflowException extends Exception {

    public StackUnderflowException() {
        System.out.println("There are no elements in the stack!");
    }
}
