package utils;
import java.util.Stack;

public class SignValidator {
        

    public boolean isValid(String s) {
      
        if (s == null || s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } 
            
            else if (current == ')' || current == '}' || current == ']') {
                // Si la pila está vacía, significa que hay un cierre sin apertura previa
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                
                if (current == ')' && top != '(') return false;
                if (current == '}' && top != '{') return false;
                if (current == ']' && top != '[') return false;
            }
        }

        
        return stack.isEmpty();
    }
}

