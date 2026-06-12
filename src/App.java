import utils.QueuePalindrome;

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
    }
}
