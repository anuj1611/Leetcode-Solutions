class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] twoSum= new int[2];
        for (int i=0; i<numbers.length-1;i++){
            for (int j=i+1; j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    twoSum[0]=i+1;
                    twoSum[1]=j+1;
                    return twoSum;
                }
            }
        }
        return twoSum;
    }
}
