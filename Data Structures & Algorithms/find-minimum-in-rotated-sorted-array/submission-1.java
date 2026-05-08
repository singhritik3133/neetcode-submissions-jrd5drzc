class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right =nums.length-1;
        if(nums[left]<=nums[right]){
            return nums[left];
        }
        while(left<=right){
            int mid=(left+right)/2;
            if(mid>0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(mid<nums.length-1 && nums[mid+1]<nums[mid] ){
                return nums[mid+1];
            }
            else if(nums[mid]<nums[left]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
        
    }
}
