class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, int index, int target, int currentSum,
                           List<Integer> currentList, List<List<Integer>> result) {
        if (currentSum == target) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        if (currentSum > target || index >= nums.length) return;

        // Exclude current
        backtrack(nums, index + 1, target, currentSum, currentList, result);

        // Include current
        currentList.add(nums[index]);
        backtrack(nums, index, target, currentSum + nums[index], currentList, result);
        currentList.remove(currentList.size() - 1); // Backtrack
    }
}