package utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePalindrome {

    public boolean isPalindrome(String text) {
       
        if (text == null) {
            return false;
        }
        
       
        String cleanText = text.toLowerCase();
        
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        
 
        for (int i = 0; i < cleanText.length(); i++) {
            char c = cleanText.charAt(i);
            queue.add(c);  
            stack.push(c); 
        }
        
        
        while (!queue.isEmpty()) {

            if (!queue.poll().equals(stack.pop())) {
                return false; 
            }
        }
        
        return true; 
    }

}
