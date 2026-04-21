class Solution {
    private int []arr;
    public int rob(int[] nums) {
        arr=new int [nums.length];
        Arrays.fill(arr,-1);
        return recc(nums,0);

        
    }
    private int recc(int []nums,int index){
        if(index>=nums.length)return 0;
        if (arr[index] != -1) {
            return arr[index];
        }
        arr[index]= Math.max(recc(nums,index+1),nums[index]+recc(nums,index+2));
        return arr[index];
    }
}
