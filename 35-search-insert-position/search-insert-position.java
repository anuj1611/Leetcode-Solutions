class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        return bs(nums, low, high, target);
    }

    private int bs(int[] nums, int low, int high, int target) {
        if (low > high)
            return low;

        int mid = (low + high) / 2;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] > target)
            return bs(nums, low, mid - 1, target);
        else 
            return bs(nums, mid + 1, high, target);
    }
}