package ru.chernov.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses1 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generate(res, sb, n, 0);

        return res;
    }

    private void generate(List<String> res, StringBuilder sb, int toOpen, int toClose) {
        if (toOpen == 0 && toClose == 0) {
            res.add(sb.toString());
            return;
        }

        if (toOpen > 0) {
            sb.append("(");
            generate(res, sb, toOpen - 1, toClose + 1);
            sb.replace(sb.length() - 1, sb.length(), "");
        }

        if (toClose > 0) {
            sb.append(")");
            generate(res, sb, toOpen, toClose - 1);
            sb.replace(sb.length() - 1, sb.length(), "");
        }
    }
}
