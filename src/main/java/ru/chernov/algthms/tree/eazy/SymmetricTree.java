package ru.chernov.algthms.tree.eazy;

import ru.chernov.algthms.tree.TreeNode;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }

        return isSymm(root.left(), root.right());
    }

    private boolean isSymm(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        if (left.val() != right.val()) {
            return false;
        }

        return isSymm(left.left(), right.right()) && isSymm(left.right(), right.left());
    }
}
