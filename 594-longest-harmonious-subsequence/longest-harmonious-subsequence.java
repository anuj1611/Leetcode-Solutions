class Solution {
    public int findLHS(int[] nums) {
        // 1. Calculating the frequency of occurrence of numbers
        // Creating a Map to know how many times each number occurs.
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // We go through all the numbers in the nums array... \U0001f6b6‍♀️
        for (int num : nums) {
            // ...and for each number num, we update its counter in frequencyMap. ⬆️
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            // (If the number is not in the card yet, start counting from zero.) 0️⃣
        }

        // 2. The search for the maximum harmonious subsequence
        // We start with a maximum length of 0. in
int maxLength = 0;

        // Going through all the unique numbers in our frequencyMap map... \U0001f5fa️
        for (int num : frequencyMap.keySet()) {
// ...and check if there is a number in the map that is 1 higher than the current one. \U0001f914
            if (frequencyMap.containsKey(num + 1)) {
                // If we found the number + 1, it means that we have a "harmonious pair"! \U0001f46f‍♂️

                // We calculate the total length of this pair by adding their frequencies. ➕
                int currentLength = frequencyMap.get(num) + frequencyMap.get(num + 1);

                // Update the maximum length if this pair is steeper than the previous ones. \U0001f3c6
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        // 3. We return the result! \U0001f389
        return maxLength;
    }
}