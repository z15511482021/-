package com.zsh.动态规划.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @version v1.0
 * @ClassName: Solution64
 * @Description:
 * @Author: 赵思豪
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        //给第一行设初始值
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        //给第一列设初始值
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
            print(dp);
        }
        return dp[m - 1][n - 1];
    }
    private void print(int [][] martix){
        System.out.println("=================");
        for (int[] ints : martix) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("=================");
    }

    @Test
    public void test(){
        int [][] grid = {{1,2,3},{4,5,6}};
        minPathSum(grid);
    }
}
