
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> solution=new ArrayList<>();
        inorderTrav(root, solution);
        return solution;
    }
    private void inorderTrav(TreeNode node,List<Integer> solution){
        if(node==null){
            return;
        }
        inorderTrav(node.left, solution);
        solution.add(node.val);
        inorderTrav(node.right,solution);
    } }
