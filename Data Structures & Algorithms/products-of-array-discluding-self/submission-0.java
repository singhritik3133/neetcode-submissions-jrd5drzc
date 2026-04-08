class Solution {
    public int[] productExceptSelf(int[] nums) {
        int num_len =nums.length;
        int [] output=new int [num_len];
        for(int i=0;i<num_len;i++){
            int product =1;
            for(int j=0;j<num_len;j++){
                if(i!=j){
                    product*=nums[j];
                }
            }
            output[i] =product;


        }
        return output;
        
        
    }
}  
