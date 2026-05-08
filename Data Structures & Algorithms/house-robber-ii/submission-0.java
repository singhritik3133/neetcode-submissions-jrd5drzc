class Solution {
    int []arr;
    public int rob(int[] nums) {
        int n=nums.length;
        arr=new int [101];

        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);

        Arrays.fill(arr,-1);

        int take_0th_i_index_house=solve(nums,0,n-2);

        Arrays.fill(arr,-1);

        int take_1th_index_house=solve(nums,1,n-1);

        return Math.max(take_0th_i_index_house,take_1th_index_house);
        
    }
    private int solve (int []nums,int i, int n){
        if(i>n)return 0;

        if(arr[i]!=-1)return arr[i];

        int steal=nums[i]+solve(nums,i+2,n);
        int skip=solve(nums,i+1,n);
        return arr[i]=Math.max(steal,skip);

    }
}