import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    List<TreeNode> children;

    public TreeNode(int data){
        this.val = data;
        this.children = new ArrayList<>();
    }
}
public class TreeDepth {
    public int calculateDepth(TreeNode root){

        int maxDepth = 0;
        if(root == null) return 0;

        if(root.children.isEmpty()) return 1;

        for(TreeNode child : root.children){
            maxDepth =  Math.max(maxDepth, calculateDepth(child));
        }
    return maxDepth+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.children.add(node1);
        root.children.add(node2);
        node2.children.add(node3);
        node2.children.add(node4);

        TreeDepth tr = new TreeDepth();
        int depth = tr.calculateDepth(root);

        System.out.println(depth);
    }
}
