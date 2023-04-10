package ru.chernov.easy;

import org.junit.jupiter.api.Test;
import ru.chernov.easy.BinaryTreeInorderTraversal.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    @Test
    void test() {
        var root = new TreeNode(1);

        var result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(List.of(1), result);
    }

    @Test
    void test1() {
        var root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        var result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(List.of(1, 3, 2), result);
    }

    @Test
    void test2() {
        var root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6, new TreeNode(5), new TreeNode(7)));

        var result = binaryTreeInorderTraversal.inorderTraversal(root);

        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), result);
    }
}
