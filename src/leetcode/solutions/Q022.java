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
            return list;
        }
        int tempLN = leftNum;
        int tempRN = rightNum;
        String tempStr = str;
        if(leftNum > 0) {
            generateParenthesis(--tempLN, rightNum, tempStr + ("("), list);
        }
        if(leftNum != rightNum){
            generateParenthesis(leftNum, --tempRN, tempStr + (")"), list);
        }
        return list;
    }
}
