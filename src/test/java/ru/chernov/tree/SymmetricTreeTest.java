package ru.chernov.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.tree.TreeNode;
import ru.chernov.algthms.tree.eazy.SymmetricTree;

class SymmetricTreeTest {

    private final SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    void test() {
        var p = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, null, null),
                        new TreeNode(4, null, null)),
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(3, null, null)));

        boolean result = symmetricTree.isSymmetric(p);

        Assertions.assertTrue(result);
    }
}
