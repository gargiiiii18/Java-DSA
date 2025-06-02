class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int x){
        val = x;
//        left = right = null;
    }
}

public class BST {

    public static TreeNode insertIntoBST(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val<val){
            root.right = insertIntoBST(root.right, val);
        }
        else{
            root.left = insertIntoBST(root.left, val);
        }
//        System.out.println("value inserted successfully");
        return root;

    }

    public static void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val+", ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 5;
        root = insertIntoBST(root, val);

        inorder(root);
    }
}