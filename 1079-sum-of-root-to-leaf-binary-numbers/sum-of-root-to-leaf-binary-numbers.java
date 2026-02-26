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
    public int sumRootToLeaf(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null)return 0;
        res(arr, root, "");
        int ans = 0;
        for(int i=0; i<arr.size(); i++){
            ans+=arr.get(i);
        }
        return ans;
    }

    void res(List<Integer> arr, TreeNode r, String s){
        if(r.left==null && r.right==null){
            arr.add(Integer.valueOf(s+r.val, 2));
            return;
        }
        if(r.left!=null){
            res(arr, r.left, s+r.val);
        }
        if(r.right!=null){
            res(arr, r.right, s+r.val);
        }
    }
}