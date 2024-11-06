package ru.chernov.algthms.hashmap.eazy;

public class JewelsAndStones {

    public int numJewelsInStones(String j, String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j.contains(String.valueOf(s.charAt(i)))) {
                res += 1;
            }
        }

        return res;
    }
}
