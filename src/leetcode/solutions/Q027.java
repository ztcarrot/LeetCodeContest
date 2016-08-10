package leetcode.solutions;

/**
 * Created by hp2016 on 2016/8/8.
 */
public class Q027 {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] != val){
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
