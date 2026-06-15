
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

        if(root == null) return new ArrayList<>();

        rightSideViewHelper(root,0,ans);  //0 is the root level
        return ans;       
    }
    public void rightSideViewHelper(TreeNode root,int k,List<Integer> ans){
  

             if(root == null) return;

             if(k == ans.size()){
                ans.add(root.val);
             }

             rightSideViewHelper(root.right,k+1,ans);
             rightSideViewHelper(root.left,k+1,ans);

    }
}
