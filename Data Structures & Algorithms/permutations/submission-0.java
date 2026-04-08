class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> arr =new ArrayList<>();
        boolean [] visitedList=new boolean[nums.length];
        recc(nums,  result,arr,  visitedList);
        return result;



        
    }
    private void recc(int []nums, List<List<Integer>> result,List<Integer> arr, boolean [] visitedList){
        if(arr.size()==nums.length){
            result.add(new ArrayList<>(arr));
          
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visitedList[i]) {
                arr.add(nums[i]);
                visitedList[i] = true;

                recc(nums, result, arr, visitedList);

                arr.remove(arr.size() - 1);
                visitedList[i] = false;
            }
        }

    }    

}
