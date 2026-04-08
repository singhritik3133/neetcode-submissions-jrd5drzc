class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List <List<Integer>> result=new ArrayList<>();
        List<Integer> subarr=new ArrayList<>();
        recc(candidates,target,subarr,result,0);
        return result;

        

        
    }
    private void recc(int[] candidates, int target,List<Integer> subarr,List <List<Integer>> result,int index){
        if(target==0){
            result.add(new ArrayList<>(subarr));
            return;
        }
        if(index>=candidates.length || target<0){
            return;
        }
        subarr.add(candidates[index]);
        recc(candidates,target-candidates[index],subarr,result,index+1);
        subarr.remove(subarr.size()-1);
        while(index<candidates.length-1 && candidates[index]==candidates[index+1]){
            index++;
        }
        recc(candidates,target,subarr,result,index+1);
        

    }
}
