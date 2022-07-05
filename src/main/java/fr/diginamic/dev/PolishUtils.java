package fr.diginamic.dev;

import java.util.Stack;

public class PolishUtils {
    public static int eval(String polish) {
        String operators= "+-*/";
        if(polish==null) {
            return 0;
        }
        polish = polish.replaceAll(" ","");
        Stack<String> stack= new Stack<String>();
        for(String t: polish.split(",")) {
            t = t.trim();
            if(!operators.contains(t)) { 
                stack.push(t);
                } 
            else{
                int a= Integer.valueOf(stack.pop());
                int b= Integer.valueOf(stack.pop());
                switch(t) {
                    case "+": stack.push(String.valueOf(a+ b));
                            break;
                    case "-": stack.push(String.valueOf(a- b));
                            break;
                    case "/": stack.push(String.valueOf(a/b));
                            break;
                    case "*": stack.push(String.valueOf(a*b));
                            break;
                }
            }
        }
        return Integer.valueOf(stack.pop());}
}