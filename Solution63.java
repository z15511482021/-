package com.zsh.动态规划.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @version v1.0
 * @ClassName: Solution63
 * @Description:63. 不同路径 II
 * @Author: 赵思豪
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[] dp = new int[col];
        for (int j = 0; j < col; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[j] = 1;
            } else {
                break;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[j] += dp[j - 1];
                } else {
                    dp[j] = 0;
                }
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[col - 1];
    }
    private void print(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("======================");
    }

    @Test
    public void test() {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        uniquePathsWithObstacles(obstacleGrid);
    }
}
