package ru.chernov.easy;

/**
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class IndexOfTheFirstOccurrence {

    /**
     * 0 ms.
     *
     * @param haystack haystack string.
     * @param needle   needle string.
     * @return index of the first occurrence.
     */
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * 0 ms.
     *
     * @param haystack haystack string.
     * @param needle   needle string.
     * @return index of the first occurrence.
     */
    public int strStr2(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();
        if (hayLen < needleLen) {
            return -1;
        }

        for (int i = 0; i <= hayLen - needleLen; i++) {
            int j = 0;
            while (j < needleLen && haystack.charAt(i + j) == needle.charAt(j)) {
                ++j;
            }

            if (j == needleLen) {
                return i;
            }
        }

        return -1;
    }
}
