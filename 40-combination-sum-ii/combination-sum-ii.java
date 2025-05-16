import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // \U0001f522 Sort to group duplicates
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // ✅ Found a valid combination
            return;
        }
        if (target < 0 || index >= nums.length) return; // ❌ Prune

        // ✅ Include current number
        current.add(nums[index]);
        backtrack(nums, index + 1, target - nums[index], current, result);
        current.remove(current.size() - 1); // \U0001f519 Backtrack

        // ❌ Exclude and skip duplicates
        int next = index + 1;
        while (next < nums.length && nums[next] == nums[index]) next++;
        backtrack(nums, next, target, current, result);
    }
}