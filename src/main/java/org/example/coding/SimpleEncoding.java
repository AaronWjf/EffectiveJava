package org.example.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SimpleEncoding {

    public static  boolean isValid(String s) {
        Map<Character,Character> cosMapping=new HashMap();
        cosMapping.put(')','(');
        cosMapping.put('}','{');
        cosMapping.put(']','[');

        Stack<Character> stackLeft = new Stack<>();

        char[] charArray = s.toCharArray();
        if (charArray.length % 2 != 0) {
            return false;
        }

        for (int i = 0; i < charArray.length; i++) {
            char x = charArray[i];
            if (!cosMapping.containsKey(x)) {
                stackLeft.push(x);
            }else{
                if(stackLeft.isEmpty()){
                    return false;
                }
                if(cosMapping.get(x)!=stackLeft.peek()){
                    return false;
                }
                stackLeft.pop();

            }

        }

        return stackLeft.isEmpty();
    }

    public static void main(String[] args) {
        boolean is = SimpleEncoding.isValid("()");
        System.out.println(is);
    }

}
