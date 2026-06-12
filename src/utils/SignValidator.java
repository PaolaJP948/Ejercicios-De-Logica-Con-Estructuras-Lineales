package utils;
import java.util.Stack;

public class SignValidator {
        

    public boolean isValid(String s) {
        // Si la cadena está vacía, técnicamente cumple las reglas
        if (s == null || s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        // Recorremos cada carácter del String
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // Si es un símbolo de apertura, lo metemos a la pila
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } 
            // Si es un símbolo de cierre
            else if (current == ')' || current == '}' || current == ']') {
                // Si la pila está vacía, significa que hay un cierre sin apertura previa
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Validamos que el símbolo de cierre corresponda al de apertura
                if (current == ')' && top != '(') return false;
                if (current == '}' && top != '{') return false;
                if (current == ']' && top != '[') return false;
            }
        }

        // Si la pila quedó vacía, todos los símbolos se cerraron correctamente
        return stack.isEmpty();
    }
}

