class Solution {
    int [] arr;
    public int minCostClimbingStairs(int[] cost) {
        arr=new int [cost.length+1];
        Arrays.fill(arr,-1);
        return Math.min(recc(cost,0),recc(cost,1));
    }
    private int  recc(int []cost , int index){
        if(index>=cost.length)return 0;
        if (arr[index] != -1) {
            return arr[index];
        }
        arr[index]= cost[index]+Math.min(recc(cost,index+1),recc(cost,index+2));
        return arr[index];
    }
}

