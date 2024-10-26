package ru.chernov.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.tree.SameTree;
import ru.chernov.algthms.tree.TreeNode;

class SameTreeTest {

    private final SameTree sameTree = new SameTree();

    @Test
    void test() {
        var p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        var q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(5 , null, null));

        boolean result = sameTree.isSameTree(p, q);

        Assertions.assertFalse(result);
    }
}
