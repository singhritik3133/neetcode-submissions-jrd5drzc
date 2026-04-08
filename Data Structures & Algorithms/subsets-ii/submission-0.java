class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> result=new ArrayList<>();
        List<Integer> subarr =new ArrayList<>();
        recc(nums,result,subarr,0);
        return result;
        
    }
    private void  recc(int []nums,List<List<Integer>> result,List<Integer>subarr,int index){
        if(index==nums.length){
            result.add(new ArrayList<>(subarr));
            return;
        } 
        subarr.add(nums[index]);
        recc(nums,result,subarr,index+1);
        subarr.remove(subarr.size()-1);
        while(index<nums.length-1 && nums[index]==nums[index+1]){
            index++;
        }
        recc(nums,result,subarr,index+1);



    }
}
