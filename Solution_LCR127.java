package com.zsh.动态规划.leetcode;

/**
 * @version v1.0
 * @ClassName: Solution_LCR127
 * @Description:
 * @Author: 赵思豪
 */
public class Solution_LCR127 {
    public int trainWays(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= num; i++) {
            c = (a + b) % 1000000007;
            a = b % 1000000007;
            b = c % 1000000007;
        }
        return c;
    }
}
