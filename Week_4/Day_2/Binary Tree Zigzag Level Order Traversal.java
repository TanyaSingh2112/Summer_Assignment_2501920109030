class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      Queue<TreeNode> q = new LinkedList<>();
      List<List<Integer>> ans = new ArrayList<>();
      boolean leftToRight = true;
      if(root == null){
        return ans;
      }
      q.add(root);
      while(!q.isEmpty()){
        int size = q.size();
        LinkedList<Integer> level = new LinkedList<>();
        for(int i=0; i<size; i++){
            TreeNode node = q.remove();
            if(leftToRight){
            level.addLast(node.val);
        }
        else{
            level.addFirst(node.val);
        }
        if(node.left!= null){
            q.add(node.left);
        }
        if(node.right != null){
            q.add(node.right);
        }
        }
        ans.add(level);
        leftToRight = !leftToRight;
      }
      return ans;
    }
}