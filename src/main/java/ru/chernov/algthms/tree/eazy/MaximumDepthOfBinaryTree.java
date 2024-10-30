package ru.chernov.algthms.tree.eazy;

import ru.chernov.algthms.tree.TreeNode;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDep = 0;
        if (root.left() != null) {
            leftDep = getDepth(root.left());
        }

        int rightDep = 0;
        if (root.right() != null) {
            rightDep = getDepth(root.right());
        }

        return 1 + Math.max(leftDep, rightDep);
    }
}
