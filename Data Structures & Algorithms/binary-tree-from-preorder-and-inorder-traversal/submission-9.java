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

   int preOrderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> map = new HashMap<>();

         for(int i=0; i < inorder.length; i++){
                map.put(inorder[i],i);
         } 
        TreeNode root = build(preorder,inorder,0,inorder.length-1,map);
                                              //instart,inEnd

        return root;
    }

    TreeNode build(int[] preorder, int[] inorder, int inStart,int inEnd,Map<Integer,Integer> map){
        if(inStart > inEnd) return null;
        
      int rootVal = preorder[preOrderIndex++];
      int rootIndex = map.get(rootVal);

      TreeNode root = new TreeNode(rootVal);

      root.left = build(preorder,inorder,inStart,rootIndex-1,map);

      root.right = build(preorder,inorder,rootIndex+1,inEnd,map);

      return root;

    }
}
