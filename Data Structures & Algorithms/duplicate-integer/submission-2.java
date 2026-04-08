class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if (nums[i]==nums[i+1]){
        //         return true;
        //     }}
        //     {
        //         return false;
        //     }
        Set<Integer> h1=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if( h1.contains(nums[i])){
                return true;
            }else{
                h1.add(nums[i]);
            }
            

        }
        return false;
        }
    }
