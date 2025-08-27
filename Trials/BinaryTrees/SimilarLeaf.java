package Trials.BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        val = data;
    }
}

public class SimilarLeaf {

    public static boolean similarLeaf(TreeNode root1, TreeNode root2){

        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        TreeNode res1 = traverseTree(root1, leaves1);
        TreeNode res2 = traverseTree(root2, leaves2);

        Collections.sort(leaves1);
        Collections.sort(leaves2);

        // System.out.println(leaves1);
        // System.out.println(leaves2);

        if(leaves1.equals(leaves2)){
            return true;
        }
        return false;
    }

    public static TreeNode traverseTree(TreeNode root, List<Integer> list){

        if(root == null){
            return root;
        }

        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        TreeNode left = traverseTree(root.left, list);
        TreeNode right = traverseTree(root.right, list);

        if(left == null){
            return right;
        } else if(right == null){
            return left;
        }
        return root;
    }
    
    public static void main(String[] args) {
        // TreeNode root1 = new TreeNode(3);
        // root1.left = new TreeNode(5);
        // root1.right = new TreeNode(1);
        // root1.left.left = new TreeNode(6);
        // root1.left.right = new TreeNode(2);
        // root1.right.right = new TreeNode(9);
        // root1.left.right.left = new TreeNode(7);
        // root1.left.right.right = new TreeNode(4);

        // TreeNode root2 = new TreeNode(1);
        // root2.left = new TreeNode(4);
        // root2.right = new TreeNode(3);
        // root2.right.left = new TreeNode(6);
        // root2.right.right = new TreeNode(2);
        // root2.right.right.left = new TreeNode(7);
        // root2.right.right.right = new TreeNode(9);

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);

        Boolean res = similarLeaf(root1, root2);
        System.out.println(res);
    }
}
