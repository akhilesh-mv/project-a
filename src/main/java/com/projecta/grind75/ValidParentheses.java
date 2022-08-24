package com.projecta.grind75;

import java.util.Arrays;
import java.util.Stack;

/**
 Valid Parentheses

 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:
 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.

 Example 1:
 Input: s = "()"
 Output: true

 Example 2:
 Input: s = "()[]{}"
 Output: true

 Example 3:
 Input: s = "(]"
 Output: false

 Constraints:
 1 <= s.length <= 104
 s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validateString("{}[]"));
    }

    private static boolean validateString(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        for(char c: s.toCharArray()){
            if(Arrays.asList('(', '{', '[').contains(c)){
                leftSymbols.push(c);
            } else if(c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            }  else if(c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            }  else if(c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }
}
