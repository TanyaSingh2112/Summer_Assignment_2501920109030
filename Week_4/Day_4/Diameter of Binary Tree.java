class Solution {
     int maxDiameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
      height(root);
      return maxDiameter;
       
    }
    private int height(TreeNode node){
       
        if(node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int diameter = leftHeight + rightHeight;
        maxDiameter= Math.max(maxDiameter, diameter);
        return 1+Math.max(leftHeight, rightHeight);

    }
}