class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        descTree(nums,0,result,subset);
        return result;
    }
    
    private void descTree(int[]nums,int i,List<List<Integer>> result,List<Integer> subset){
        if(i>=nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        descTree(nums,i+1,result,subset);
        subset.remove(subset.size()-1);
        descTree(nums,i+1,result,subset);
    
    }
    
    
}
