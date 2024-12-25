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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<String> pathStack = new Stack<>();
        nodeStack.push(root);
        pathStack.push(String.valueOf(root.val));
        while (!nodeStack.isEmpty()) {
            TreeNode currentNode = nodeStack.pop();
            String currentPath = pathStack.pop();
            if (currentNode.left == null && currentNode.right == null) {
                paths.add(currentPath);}
            if (currentNode.right != null) {
                nodeStack.push(currentNode.right);
                pathStack.push(currentPath + "->" + currentNode.right.val);
            }
            if (currentNode.left != null) {
                nodeStack.push(currentNode.left);
                pathStack.push(currentPath + "->" + currentNode.left.val);
            }
            }
        return paths;
}}