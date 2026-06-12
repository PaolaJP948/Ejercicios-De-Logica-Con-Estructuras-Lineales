

    import utils.SignValidator;
import utils.StackSorter;
import utils.QueuePalindrome;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        

        //  Validacion de sgignos

        System.out.println("--- Ejercicio 01: Validación de Signos ---");
        SignValidator validator = new SignValidator();
        
        String stringValido = "{[()]}";
        String stringInvalido = "{[(])}";
        String stringIncompleto = "((([";

        System.out.println("¿Es válido '" + stringValido + "'?: " + validator.isValid(stringValido)); 
        System.out.println("¿Es válido '" + stringInvalido + "'?: " + validator.isValid(stringInvalido)); 
        System.out.println("¿Es válido '" + stringIncompleto + "'?: " + validator.isValid(stringIncompleto)); 
        System.out.println();

        //  Ordenar un Stack
        
        System.out.println("--- Ejercicio 02: Ordenar un Stack ---");
        StackSorter sorter = new StackSorter();
        Stack<Integer> miPila = new Stack<>();
        
        miPila.push(2);
        miPila.push(4);
        miPila.push(1);
        miPila.push(5);

        System.out.println("Pila original : " + miPila);
        System.out.println("actual: " + miPila.peek());
        
        
        
        System.out.println("Pila ordenada: " + miPila);
        System.out.println("Nuevo  S " + miPila.peek());
        System.out.println();

        
        System.out.println("--- Ejercicio 03: Palíndromo usando Colas ---");
        QueuePalindrome palindromeChecker = new QueuePalindrome();
        
        String palabraPalindroma = "Radar";
        String palabraNormal = "Java";

        System.out.println("¿Es palíndromo '" + palabraPalindroma + "'?: " + palindromeChecker.isPalindrome(palabraPalindroma)); 
        System.out.println("¿Es palíndromo '" + palabraNormal + "'?: " + palindromeChecker.isPalindrome(palabraNormal)); 
        System.out.println("\n=============================================");
    }
}