package leetcode.solutions;

/**
 * Created by hp2016 on 2016/8/8.
 */
public class Q026 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int length = 0;
        for(int i = 1;i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                //replace the duplicating with the new number
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
