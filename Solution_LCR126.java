package com.zsh.动态规划.leetcode;

import org.junit.Test;

/**
 * @version v1.0
 * @ClassName: Solution_LCR126
 * @Description:
 * @Author: 赵思豪
 */
public class Solution_LCR126 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % 1000000007;
            a = b % 1000000007;
            b = c % 1000000007;
        }
        return c;
    }
    @Test
    public void test(){
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(44));
    }
}
