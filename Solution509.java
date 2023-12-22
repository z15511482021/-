package com.zsh.动态规划.leetcode;

/**
 * @version v1.0
 * @ClassName: Solution509
 * @Description:509. 斐波那契数
 * @Author: 赵思豪
 */
public class Solution509 {
    public int fib(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
