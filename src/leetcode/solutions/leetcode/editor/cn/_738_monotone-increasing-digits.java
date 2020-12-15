package leetcode.solutions.leetcode.editor.cn;


//Monotone Increasing Digits


//
//Given a non-negative integer N, find the largest number that is less than or e
//qual to N with monotone increasing digits.
// 
//(Recall that an integer has monotone increasing digits if and only if each pai
//r of adjacent digits x and y satisfy x <= y.)
// 
//
// Example 1: 
// 
//Input: N = 10
//Output: 9
// 
// 
//
// Example 2: 
// 
//Input: N = 1234
//Output: 1234
// 
// 
//
// Example 3: 
// 
//Input: N = 332
//Output: 299
// 
// 
//
// Note:
//N is an integer in the range [0, 10^9].
// Related Topics 贪心算法 
// 👍 87 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution738 {
    public int monotoneIncreasingDigits(int N) {
        String n = String.valueOf(N);
        StringBuilder ans  = new StringBuilder();

        for(int i = 0 ;i<n.length()-1;i++){
            if(n.charAt(i)>n.charAt(i+1)) {
                ans.append((char) (n.charAt(i)-1));
                for(int j = i+1;j<n.length();j++){
                    ans.append("9");
                }
                return monotoneIncreasingDigits(Integer.valueOf(ans.toString()));
            } else{
                ans.append(n.charAt(i));
            }
        }

        return Integer.valueOf(ans.append(n.charAt(n.length()-1)).toString());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

