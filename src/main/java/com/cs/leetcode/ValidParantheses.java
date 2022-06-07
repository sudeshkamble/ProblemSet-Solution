package com.cs.leetcode;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        System.out.println(validParantheses("(){}[]"));
    }

    private static boolean validParantheses(String s) {

        char[] brackets=s.toCharArray();
        if(brackets.length%2==1){
            return false;
        }
        Stack<Character> characterStack=new Stack<>();
        for(char bracket:brackets){
           if(bracket=='[' || bracket=='(' || bracket=='{'){
               characterStack.push(bracket);
           }else{
               if(characterStack.size()==0){
                   return false;
               }
               char popped=characterStack.pop();
               if(popped!=revBracket(bracket))
                   return false;
           }
        }
        if(characterStack.size()!=0)
            return false;
        return true;
    }

    private static char revBracket(char bracket) {
        if(bracket==']')
            return '[';
        if(bracket==')')
            return '(';
        if(bracket=='}')
            return '{';
        return '\0';
    }
}
