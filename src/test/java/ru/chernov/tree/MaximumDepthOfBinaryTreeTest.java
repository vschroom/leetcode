package ru.chernov.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.tree.TreeNode;
import ru.chernov.algthms.tree.eazy.MaximumDepthOfBinaryTree;

class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    void test() {
        var root = new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null, null)));

        int result = maximumDepthOfBinaryTree.maxDepth(root);

        Assertions.assertEquals(3, result);
    }
}
