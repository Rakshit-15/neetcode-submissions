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

    public int height(TreeNode root){
        if(root == null) return 0;

        int leftH=height(root.left);

        if(leftH==-1) return -1;

        int rightH=height(root.right);
       
       if(rightH == -1) return -1;

        if(Math.abs(leftH-rightH) > 1){
            return -1;
        }

        return 1+Math.max(leftH,rightH);
    }
    public boolean isBalanced(TreeNode root) {
        
        // if(root == null)return true;

        // int leftHeight = height(root.left);
        // int rightHeight = height(root.right);

        // if(Math.abs(leftHeight - rightHeight) > 1)
        //     return false;

        // return isBalanced(root.left) && isBalanced(root.right);  //O(N^2)
            
             if(height(root) == -1)return false;
             return true;

    }
}
