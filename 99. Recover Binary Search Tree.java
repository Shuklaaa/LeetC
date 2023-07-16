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


//  USING EXTRA SPACE
class Solution {
    int idx = 0;
    public void recoverTree(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        Collections.sort(res);
        inorderCorr(root, res);
    }

    public void inorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    public void inorderCorr(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }

        inorderCorr(root.left, res);
        root.val = res.get(idx++);
        inorderCorr(root.right, res);
    }
}