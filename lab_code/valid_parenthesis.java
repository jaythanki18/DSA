package lab_code;

import java.util.Stack;

public class valid_parenthesis {
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
                continue;
            }
            if(stack.size()==0) return false;
            if(c==')' && stack.pop()=='(')
                continue;
            else if(c=='}' && stack.pop()=='{')
                continue;
            else if(c==']' && stack.pop()=='[')
                continue;
            else
                return false;
        }
        return stack.isEmpty();
    }
}
