class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int x){

            val = x;
        }
    }
    public class validateBST {

    public static boolean validateTree( TreeNode root, Integer low, Integer high) {
        if(root==null){
            return true;
        }
        if((low != null && root.val<=low) || (high != null && root.val > high)){
            return false;
        }
        boolean leftSubtreeValidate = validateTree(root.left, low, root.val);
        boolean rightSubtreeValidate = validateTree(root.right, root.val, high);
        return leftSubtreeValidate && rightSubtreeValidate;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(8);

        boolean isValidated = validateTree(root, null, null);
        System.out.println(isValidated);

    }
}