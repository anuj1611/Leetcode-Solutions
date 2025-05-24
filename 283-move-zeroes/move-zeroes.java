class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;   // \U0001f446 Pointer for the next non-zero position
        int right = 0;  // \U0001f446 Pointer to scan the array

        while (right < nums.length) {  // \U0001f504 Loop through the array
            if (nums[right] != 0) {  // \U0001f575️‍♀️ Found a non-zero number!
                // \U0001f504 Swap nums[left] and nums[right]
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;  // ➡️ Move left to the next position
            }
            right++; // ➡️ Always move right to the next position
        }
    }
}