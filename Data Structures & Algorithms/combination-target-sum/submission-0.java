class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        disSum(target,nums,0,result,arr,0);
        return result;
    }


         
    private void disSum(int target,int []nums,int index,List<List<Integer>> result,List<Integer>arr,int sum){
        if(target==sum){
            result.add(new ArrayList<>(arr));
            return;
        }
        if(target<sum){
            return;
        }
        for(int i=index;i<nums.length;i++){
            arr.add(nums[i]);
            disSum(target,nums,i,result,arr,sum+nums[i]);
            arr.remove(arr.size()-1);

        }
        
    }
}
