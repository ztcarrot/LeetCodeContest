package leetcode.solutions;

import java.util.Stack;

/**
 * Created by hp2016 on 2016/7/30.
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Q020 {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if ("(".equals(String.valueOf(chars[i])) || "{".equals(String.valueOf(chars[i])) || "[".equals(String.valueOf(chars[i]))){
                stack.push((String.valueOf(chars[i])));
            }else
            if(!stack.empty() && ")".equals(String.valueOf(chars[i]))){
                String peek = (String) stack.peek();
                if("(".equals((String) stack.peek())){
                    stack.pop();
                }else {
                    return false;
                }
            }else if(!stack.empty() && "]".equals(String.valueOf(chars[i]))){
                if("[".equals((String)stack.peek())){
                    stack.pop();
                }else {
                    return false;
                }
            }else if(!stack.empty() && "}".equals(String.valueOf(chars[i]))){
                if("{".equals((String)stack.peek())){
                    stack.pop();
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }
        if(stack.empty()){
            return true;
        }else
            return false;
    }

}
