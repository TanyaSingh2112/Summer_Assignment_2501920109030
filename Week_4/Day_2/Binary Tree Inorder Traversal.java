class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
         List<Integer> left = inorderTraversal(root.left);
         list.addAll(left);
        list.add(root.val);
         List<Integer> right = inorderTraversal(root.right);
         list.addAll(right);
        return list;
    }
}