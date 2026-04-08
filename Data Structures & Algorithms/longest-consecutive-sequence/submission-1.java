class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max_count=1;
        int current_count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                current_count++;
            }
            else{
                current_count=1;
            }
            max_count = Math.max(max_count, current_count);
        }
        return max_count;
    }
}
