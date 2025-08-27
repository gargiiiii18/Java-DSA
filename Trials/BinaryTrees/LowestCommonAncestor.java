package Trials.BinaryTrees;

class TreeNode{
    int val;

    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        val = data;
    }
}

public class LowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);


        if(left == null){
            return right;
        } else if(right == null){
            return left;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(4);

        TreeNode p = root.right.left;
        TreeNode q = root.right.right;

        TreeNode result = lowestCommonAncestor(root, p, q);
        System.out.println(result.val);
    }
}
