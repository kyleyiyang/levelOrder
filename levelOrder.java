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
        
        List<List<Integer>> lst = new ArrayList<>();
        if (root==null) return lst;
        inOrderTraversal(root, lst, 0);
        return lst;
    }
    public void inOrderTraversal(TreeNode root,List<List<Integer>> lst,int n) {
        n++;
        if (root!=null) {
            if (lst.size()<n) lst.add(new ArrayList<>());
            lst.get(n-1).add(root.val); 
            
            inOrderTraversal(root.left,lst,n);
            inOrderTraversal(root.right,lst,n);
        }
    }
}
