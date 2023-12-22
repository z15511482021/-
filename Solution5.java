package com.zsh.动态规划.leetcode;

/**
 * @version v1.0
 * @ClassName: Solution5
 * @Description:
 * @Author: 赵思豪
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        left = 0;
        right = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            extend(chars, i, i);
            extend(chars, i, i + 1);
        }
        return s.substring(left, right + 1);
    }

    int left;
    int right;

    private void extend(char[] chars, int i, int j) {
        while (i >= 0 && j < chars.length && chars[i] == chars[j]) {
            i--;
            j++;
        }
        i++;
        j--;
        if (j - i > right - left) {
            right = j;
            left = i;
        }
    }
}
