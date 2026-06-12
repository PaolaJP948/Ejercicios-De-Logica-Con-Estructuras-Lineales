import java.util.Stack;
import utils.QueuePalindrome;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        QueuePalindrome evaluator = new QueuePalindrome();

        
        String palabra1 = "ana";
        String  palabra2 = "radar";
        String palabra3 = "java";

        // 3. Evaluamos e imprimimos los resultados en consola
        System.out.println("Input: \"" + palabra1 + "\"");
        System.out.println("Output: " + evaluator.isPalindrome(palabra1));
        System.out.println();

        System.out.println("Input: \"" + palabra2 + "\"");
        System.out.println("Output: " + evaluator.isPalindrome(palabra2));
        System.out.println();

        System.out.println("Input: \"" + palabra3 + "\"");
        System.out.println("Output: " + evaluator.isPalindrome(palabra3));

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        System.out.println("Input:  (tope) 5 -> 1 -> 4 -> 2");

        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);

        System.out.print("Output: (tope) ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) {
                System.out.print(" -> ");
            }
        }
        System.out.println();


    }
}
