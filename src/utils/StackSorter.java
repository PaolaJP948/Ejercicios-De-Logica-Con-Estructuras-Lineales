package utils;

import java.util.Stack;

public class StackSorter {
    public void sortStack(Stack<Integer> stack) {

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {

            int p = stack.pop();

            while (!tempStack.isEmpty()
                    && tempStack.peek() > p) {

                stack.push(tempStack.pop());
            }

            tempStack.push(p);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

}
