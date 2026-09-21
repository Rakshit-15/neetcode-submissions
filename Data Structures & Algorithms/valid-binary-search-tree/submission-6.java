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
    public boolean isValidBST(TreeNode root) {
        
       return isValidateBSTHelper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
       
    }

    boolean isValidateBSTHelper(TreeNode root,Integer low,Integer high){

      if(root == null) return true;

      if(root.val <= low || root.val >= high) return false;

      return isValidateBSTHelper(root.left,low,root.val) && isValidateBSTHelper(root.right,root.val,high);
    }
}
