class Solution {
    public int search(int[] nums, int target) {
        int foundNum = -1;

        for (int i=0; i <nums.length; i++){
            if( nums[i] == target){
                foundNum = i;
                break;
            }
        }
        return foundNum;
        
    }
}