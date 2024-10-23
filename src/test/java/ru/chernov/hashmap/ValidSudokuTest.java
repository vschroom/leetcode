package ru.chernov.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.chernov.algthms.hashmap.medium.ValidSudoku;

class ValidSudokuTest {

    private final ValidSudoku validSudoku = new ValidSudoku();

    @Test
    void test1() {
        char[][] board = {
                {'.', '.', '4', '.', '5', '.', '6', '3', '.'},
                {'.', '.', '.', '3', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '3', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}};

        boolean result = validSudoku.isValidSudoku(board);

        Assertions.assertFalse(result);
    }
}
