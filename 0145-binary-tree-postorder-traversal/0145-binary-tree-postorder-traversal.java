class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> solution=new ArrayList<>();
        postorderTrav(root, solution);
        return solution;
    }
    private void postorderTrav(TreeNode node,List<Integer> solution){
        if(node==null){
            return;
        }
        postorderTrav(node.left, solution);
        postorderTrav(node.right,solution);
        solution.add(node.val);
    } }
