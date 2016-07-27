package leetcode.solutions;

/**
 * Created by hp2016 on 2016/7/27.
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        if(strs[0].equals("")){
            return "";
        }
        StringBuffer LCP = new StringBuffer("");
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 1; j < strs.length; j++){
                if (strs[j].length() < i + 1){
                    return LCP.toString();
                }
                if(strs[0].charAt(i) == strs[j].charAt(i)){
                    continue;
                }else {
                    return LCP.toString();
                }
            }
            LCP.append(strs[0].charAt(i));
        }
        return LCP.toString();
    }
}
