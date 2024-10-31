package ru.chernov.algthms.hashmap.eazy;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] lt = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            lt[magazine.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char curChar = ransomNote.charAt(i);
            if (lt[curChar - 'a'] == 0) {
                return false;
            }
            lt[curChar - 'a'] -= 1;
        }

        return true;
    }
}
