class Solution {
    public int findDuplicate(int[] nums) {
        int left=0;
        int right=0;
        while(true){
            left=nums[left];
            right=nums[nums[right]];
            if(left==right){
                break;
            }
        }

        int slow2=0;
        while(true){
            left=nums[left];
            slow2=nums[slow2];
            if(left==slow2){
                return left;
            }
        }
    }
}
