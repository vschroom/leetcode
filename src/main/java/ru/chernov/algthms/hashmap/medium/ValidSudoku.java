package ru.chernov.algthms.hashmap.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    HashMap<Integer, Set<Character>> mapX = new HashMap<>();
    HashMap<Integer, Set<Character>> mapY = new HashMap<>();
    public boolean isValidSudoku(char[][] b) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                var setX = mapX.getOrDefault(i, new HashSet<>());
                if (setX.contains(b[i][j])) {
                    return false;
                } else {
                    if (b[i][j] != '.') {
                        setX.add(b[i][j]);
                        mapX.put(i, setX);
                    }
                }

                var setY = mapY.getOrDefault(i, new HashSet<>());
                if (setY.contains(b[j][i])) {
                    return false;
                } else {
                    if (b[j][i] != '.') {
                        setY.add(b[j][i]);
                        mapY.put(i, setY);
                    }
                }
            }
        }

        HashSet<Character> s = new HashSet<>();
        for (int i = 1; i < 8; i += 3) {
            for (int j = 1; j < 8; j += 3) {
                if (b[i][j] != '.') {
                    s.add(b[i][j]);
                }

                if (b[i][j + 1] != '.' && !s.add(b[i][j + 1])) {
                    return false;
                }
                if (b[i][j - 1] != '.' && !s.add(b[i][j - 1])) {
                    return false;
                }
                if (b[i + 1][j + 1] != '.' && !s.add(b[i + 1][j + 1])) {
                    return false;
                }
                if (b[i - 1][j + 1] != '.' && !s.add(b[i - 1][j + 1])) {
                    return false;
                }
                if (b[i - 1][j] != '.' && !s.add(b[i - 1][j])) {
                    return false;
                }
                if (b[i + 1][j] != '.' && !s.add(b[i + 1][j])) {
                    return false;
                }
                if (b[i - 1][j - 1] != '.' && !s.add(b[i - 1][j - 1])) {
                    return false;
                }
                if (b[i + 1][j - 1] != '.' && !s.add(b[i + 1][j - 1])) {
                    return false;
                }
                s.clear();
            }
        }

        return true;
    }
}
