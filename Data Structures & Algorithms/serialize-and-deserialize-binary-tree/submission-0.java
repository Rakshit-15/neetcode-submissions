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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null) return "";

        StringBuilder ser = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            
            if(node == null){
                ser.append("# ");
                continue;
            }
            ser.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);

        }
        return ser.toString(); //serialised string
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") return null;
         Queue<TreeNode> q = new LinkedList<>();
         String[] serArr = data.split(" ");
         TreeNode root = new TreeNode(Integer.parseInt(serArr[0]));
         q.add(root);
        
         for(int i=1;i<serArr.length;i++){
              TreeNode parent = q.poll();
              if(!serArr[i].equals("#")){
              TreeNode left = new TreeNode(Integer.parseInt(serArr[i]));
              parent.left=left;
              q.add(left);
              }
              if(!serArr[++i].equals("#")){
              TreeNode right = new TreeNode(Integer.parseInt(serArr[i]));
              parent.right=right;
              q.add(right);
              }

         }
         return root;
        
    }
}
