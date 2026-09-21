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
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

         q.add(root);

        while(!q.isEmpty()){

             int currLevelSize = q.size();
            List<Integer> currList = new ArrayList<>();
                 
            for(int i = 0; i < currLevelSize ; i++){
                 TreeNode currNode = q.poll();
                 currList.add(currNode.val);
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }
            res.add(currList);
        }

        return res;
    }
}
