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
        List<List<Integer>> wrapList = new LinkedList<>();
        if(root==null)
            return wrapList;
        Queue <TreeNode> tree=new LinkedList<>();
        tree.add(root);
        while(!tree.isEmpty()){
            int levelSize = tree.size();

            List <Integer>sublist=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode temp = tree.poll();
                sublist.add(temp.val);

                if(temp.left!=null)
                    tree.add(temp.left);
                if(temp.right!=null){
                    tree.add(temp.right);
                }}
            wrapList.add(sublist);
        }
        return wrapList;
    }
}