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

        StackSorter sorter = new StackSorter();
        Stack<Integer> miStack = new Stack<>();

        // Llenamos el stack de abajo hacia arriba.
        // Para que el tope sea 5, debemos meterlos en orden inverso al input visual:
        miStack.push(2);
        miStack.push(4);
        miStack.push(1);
        miStack.push(5); // Este queda en el tope

        System.out.println("Input original: (tope) " + miStack);

        // Ordenamos el stack
        sorter.sortStack(miStack);

        System.out.println("Output ordenado: (tope) " + miStack);
    }
}
