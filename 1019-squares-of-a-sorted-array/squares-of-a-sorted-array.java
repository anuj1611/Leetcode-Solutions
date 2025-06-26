class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length; i++){
            int square=nums[i]*nums[i];
            nums[i]=square;
        }
        Arrays.sort(nums);
        return nums;
        
    }
    
}