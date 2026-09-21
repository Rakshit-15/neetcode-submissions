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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        rightSideViewHelper(root,ans,0);//0 for the 0th level

        return ans;
        
    }

    void rightSideViewHelper(TreeNode root, List<Integer> ans, int k){

        if(root == null) return;

        if(k == ans.size()){
            ans.add(root.val);
        }

        rightSideViewHelper(root.right,ans,k+1);
        rightSideViewHelper(root.left,ans,k+1);


    } 
}
