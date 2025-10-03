package BinaryTrees;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        val = data;
    }
}

public class BinaryTreeDepth {

    public int calculateDepth(TreeNode root){

        if(root == null) return 0;

        int leftDepth = calculateDepth(root.left);
        int rightDepth = calculateDepth(root.right);

        return Math.max(leftDepth, rightDepth)+1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.right.left = new TreeNode(4);

        BinaryTreeDepth bt = new BinaryTreeDepth();
        int depth = bt.calculateDepth(root);

        System.out.println(depth);
    }
}
