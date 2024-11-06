package ru.chernov.algthms.hashmap.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {

    private final HashMap<Character, Character> st = new HashMap<>();

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        var res = new ArrayList<String>();
        for (var w : words) {
            if (matches(w, pattern)) {
                res.add(w);
            }
            st.clear();
        }
        return res;
    }

    private boolean matches(String target, String pattern) {
        for (int i = 0; i < target.length(); i++) {
            if (st.containsKey(pattern.charAt(i))) {
                if (st.get(pattern.charAt(i)) != target.charAt(i)) {
                    return false;
                }
            } else {
                if (st.containsValue(target.charAt(i))) {
                    return false;
                }
                st.put(pattern.charAt(i), target.charAt(i));
            }
        }

        return true;
    }
}
