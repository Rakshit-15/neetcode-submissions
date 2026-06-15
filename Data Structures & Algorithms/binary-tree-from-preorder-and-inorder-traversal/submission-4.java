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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        

        return bulidTreehelper(preorder,inorder,0,0,preorder.length-1,inorder.length-1);
    
    }

    public TreeNode  bulidTreehelper(int [] preorder,int[]inorder,int siIn,int siPre,int eiPre,int eiIn){

        if(siPre > eiPre) return null;

        int rootData = preorder[siPre];

        TreeNode root = new TreeNode(rootData);

        int rootIndex = -1;

        for(int i =0; i <= eiIn ; i++){
            if(inorder[i]== rootData){
                 rootIndex = i;
                 break;
            }
        }


        int siPreLeft = siPre+1; 
        int eiPreRight =eiPre;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;
        int siInright = rootIndex+1;
        int eiInRight =eiIn;
   
        int inLeftSubTreeLength = eiInLeft -  siInLeft + 1 ;
        

        int eiPreLeft = siPreLeft + inLeftSubTreeLength -1 ;
        int siPreRight =  eiPreLeft +1 ;

       TreeNode left =   bulidTreehelper(preorder,inorder,siInLeft,siPreLeft,eiPreLeft,eiInLeft);
       TreeNode right =  bulidTreehelper(preorder,inorder,siInright,siPreRight,eiPreRight,eiInRight);

       root.left = left;
       root.right =right;

        return root;

    }
}
