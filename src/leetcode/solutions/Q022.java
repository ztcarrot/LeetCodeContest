package leetcode.solutions;

import java.util.*;

/**
 * Created by hp2016 on 2016/8/2.
 */
public class Q022 {
    public static List<String> generateParenthesis(int n) {
        return generateParenthesis(n, n, "", new LinkedList<String>());
    }
    private static LinkedList<String> generateParenthesis(int leftNum, int rightNum, String str, LinkedList<String> list) {
        if(rightNum == 0){
            list.add(str.toString());
        }else{
            if(leftNum > 0) {
                generateParenthesis(--leftNum, rightNum, str + ("("), list);
                leftNum++;
            }
            if(leftNum != rightNum){
                generateParenthesis(leftNum, --rightNum, str + (")"), list);
            }
        }
        return list;
    }
}
