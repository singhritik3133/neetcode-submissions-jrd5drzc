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
    public int kthSmallest(TreeNode root, int k) {
        int countleft=count(root.left);
        if(countleft+1==k){
            return root.val;
        }
        else if(countleft>=k){
            
           return  kthSmallest(root.left,k);

        }
        else{
           return kthSmallest(root.right,k-countleft-1);
        }

        
    }
    public int count(TreeNode node){
        if(node==null)return 0;
        return 1+count(node.left)+count(node.right);
    }
}
