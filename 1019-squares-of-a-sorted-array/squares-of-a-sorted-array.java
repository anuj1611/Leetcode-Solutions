import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length) {
            int square = nums[i] * nums[i];
            nums[i] = square;
            i++;
        }
        Arrays.sort(nums); // re-sort because squaring negatives can change order
        return nums;
    }
}

        /*
        for (int i=0; i<nums.length; i++){
            int square=nums[i]*nums[i];
            nums[i]=square;
        }
        Arrays.sort(nums);
    
        return nums;
        
    }
    
}
*/