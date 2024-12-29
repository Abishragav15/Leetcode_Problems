class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> solution=new ArrayList<>();
        preorderTrav(root, solution);
        return solution;
    }
    private void preorderTrav(TreeNode node,List<Integer> solution){
        if(node==null){
            return;
        }
        solution.add(node.val);
        preorderTrav(node.left, solution);
        preorderTrav(node.right,solution);
    } }
