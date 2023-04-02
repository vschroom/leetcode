package ru.chernov.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses2 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, "", 0, 0, n);

        return res;
    }

    private void generate(List<String> res, String cur, int open, int close, int n) {
        if (cur.length() == n * 2) {
            res.add(cur);
            return;
        }

        if (open < n) {
            generate(res, cur + "(", open + 1, close, n);
        }

        if (close < open) {
            generate(res, cur + ")", open, close + 1, n);
        }
    }
}
