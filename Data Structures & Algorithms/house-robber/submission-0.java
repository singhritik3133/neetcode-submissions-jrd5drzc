class Solution {
    public int rob(int[] nums) {
        int maxSum = 0;

        int sum1 = 0; 
        int sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(sum2, sum1 + nums[i]);
            sum1 = sum2;
            sum2 = temp;
            maxSum = sum2;
        }

        return maxSum;
    }
}