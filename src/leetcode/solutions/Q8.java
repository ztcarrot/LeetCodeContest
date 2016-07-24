package leetcode.solutions;

/**
 * Created by hp2016 on 2016/7/22.
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class Q8 {
    //String to int

    public int myAtoi(String str) {
        if (str == null || "".equals(str)){
            return 0;
        }
        str = str.trim();
        String substring[] = str.split("\\.");
        long number = 0;
        int sign = 1;
        char[] chars = str.toCharArray();

        int length = 0;
        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i == 0){
                if ("+".equals(String.valueOf(chars[i])))
                    continue;
                if ("-".equals(String.valueOf(chars[i]))) {
                    sign = -1;
                    continue;
                }
            }
            if(( c >= 48 && c <= 57)){
                length++;
                number = number * 10 + Integer.valueOf(String.valueOf(c));
                if(length > ((Integer) Integer.MAX_VALUE).toString().length()) {
                    if (sign ==1)
                        return  Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                }
            }else
                break;
        }
        number *= sign;
        if (number>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if ( number < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) number;
    }
}
