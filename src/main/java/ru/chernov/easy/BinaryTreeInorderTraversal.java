package ru.chernov.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return List.of();
        List<Integer> result = new ArrayList<>();
        traversal(result, root);

        return result;
    }

    private void traversal(List<Integer> result, TreeNode root) {
        if (root.left != null) {
            traversal(result, root.left);
        }

        result.add(root.val);

        if (root.right != null) {
            traversal(result, root.right);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
