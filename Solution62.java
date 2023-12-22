package com.zsh.动态规划.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @version v1.0
 * @ClassName: Solution62
 * @Description:
 * @Author: 赵思豪
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }
    @Test
    public void test(){
        System.out.println(uniquePaths(3, 7));
    }
}
