//Leetcode Compiled

package Hashing_3_X.Utkarsh;

public class removeDuplicate {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int ptr = 1;
        
        for(int i = 1;i<nums.length;i++){
            if(!(nums[i]==nums[i-1])){
                nums[ptr++] = nums[i];
            }
        }
        return ptr;
    }
}