/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        recc(root);
        return maxSum;

        
    }
    private int recc(TreeNode root){
        if(root==null){
            return 0;
        }

        int left=recc(root.left);
        if(left<0){
            left=0;
        }
        int l=left;
        int right=recc(root.right);
        if(right<0){
            right=0;
        }
        int r=right;

        int throughRoot=l+r+root.val;

        maxSum=Math.max(maxSum,throughRoot);

        return Math.max(l,r)+root.val;
    }
}
