class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(height==null || n==0){
            return 0;
        
        }

        int left=0 ,right=n-1;;
        int result=0;
        int leftmax=height[left];
        int rightmax=height[right];
        while(left<right){
            if(leftmax < rightmax){
                left++;
                leftmax=Math.max(leftmax,height[left]);
                result+= leftmax-height[left];

            }
            else{
                right--;
                rightmax=Math.max(rightmax,height[right]);
                result+=rightmax-height[right];
            }
        }
        return result;
        
    }
}
