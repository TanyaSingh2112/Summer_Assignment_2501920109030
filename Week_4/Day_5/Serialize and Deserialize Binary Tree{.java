public class Codec {
    int index = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }
    private void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }
        sb.append(root.val).append(",");
        dfs(root.left, sb);
        dfs(root.right, sb);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        index = 0;
        return build(arr);
    }
    private TreeNode build(String[] arr) {
        if (arr[index].equals("N")) {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
        index++;
        root.left = build(arr);
        root.right = build(arr);
        return root;
    }
}