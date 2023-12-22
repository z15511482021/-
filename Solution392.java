package com.zsh.动态规划.leetcode;

import org.junit.Test;

/**
 * @version v1.0
 * @ClassName: Solution392
 * @Description:392. 判断子序列
 * @Author: 赵思豪
 */
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int i = 0, j = 0;
        while (j < t.length() && i < s.length()) {
            if (chars[i] == chart[j]) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    @Test
    public void test() {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
