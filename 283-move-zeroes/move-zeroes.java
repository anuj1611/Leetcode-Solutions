class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

//we use two pointers left and i. left is slow pointer and i is faast pointer. 
// both start at first element of array. we use loop of i, i keepps going until
        for (int i=0; i <nums.length; i++){
            if (nums[i]!=0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }

        }
        
    }
}