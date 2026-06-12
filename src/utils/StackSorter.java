package utils;

import java.util.Stack;

public class StackSorter {
    public void sortStack(Stack<Integer> stack) {

        if (stack == null || stack.isEmpty()) {
            return;
        }

        Stack<Integer> auxStack = new Stack<>();

   
        while (!stack.isEmpty()) {

            int current = stack.pop();

 
            while (!auxStack.isEmpty() && auxStack.peek() > current) {
                stack.push(auxStack.pop());
            }

            auxStack.push(current);
        }

        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }

}
