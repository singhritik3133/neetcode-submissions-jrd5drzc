class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set_nums=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set_nums.add(nums[i]);
        }
        int max_count=1;
        for(int i:set_nums){
            if(!set_nums.contains(i-1)){
                int length=1;
                while(set_nums.contains(i+length)){
                    length++;
                }
                max_count=Math.max(max_count,length);
            }
        }
        return max_count;
    }
}
