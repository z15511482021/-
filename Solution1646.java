package com.zsh.动态规划.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @version v1.0
 * @ClassName: Solution1646
 * @Description:
 * @Author: 赵思豪
 */
public class Solution1646 {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] =1;
        int max = 1;
        if (n % 2 == 1) {
            for (int i = 1; i <= (n - 1) / 2; i++) {
                dp[i * 2] = dp[i];
                dp[i * 2 + 1] = dp[i] + dp[i + 1];
                max = Integer.max(max, Integer.max(dp[i * 2], dp[i * 2 + 1]));
            }
        } else {
            for (int i = 1; i < n / 2; i++) {
                dp[i * 2] = dp[i];
                dp[i * 2 + 1] = dp[i] + dp[i + 1];
                max = Integer.max(max, Integer.max(dp[i * 2], dp[i * 2 + 1]));
            }
            dp[n] = dp[n / 2];
            max = Integer.max(dp[n], max);
        }
        return max;
    }

    @Test
    public void test() {
        Assert.assertEquals(getMaximumGenerated(1), 1);
        Assert.assertEquals(getMaximumGenerated(0), 0);
        Assert.assertEquals(getMaximumGenerated(3), 2);
        Assert.assertEquals(getMaximumGenerated(7), 3);
        Assert.assertEquals(getMaximumGenerated(2), 1);
        System.out.println(getMaximumGenerated(4));
    }
}
