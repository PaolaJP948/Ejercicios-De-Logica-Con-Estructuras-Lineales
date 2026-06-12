package utils;

import java.util.Stack;

public class StackSorter {
<<<<<<< HEAD
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
=======
   public void sortStack(Stack<Integer> stack) {
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
       
>>>>>>> 6116c85bcdb7c3196ae9134c84ff140469e0963f

}
