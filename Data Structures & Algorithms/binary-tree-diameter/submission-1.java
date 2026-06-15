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
    int maxi=0;

    public int height(TreeNode root){
        if(root==null)return 0;
        
        int left=height(root.left);
        int right=height(root.right);

        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {

        if( root == null) return 0;

        int leftN =  height(root.left);
        int rightN = height(root.right);
         
         maxi=  Math.max(maxi,leftN+rightN);

         diameterOfBinaryTree(root.left);
         diameterOfBinaryTree(root.right);

        return  maxi;
        
    }
}
